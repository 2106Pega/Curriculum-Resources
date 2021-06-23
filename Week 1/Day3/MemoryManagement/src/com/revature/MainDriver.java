package com.revature;

import com.revature.model.Fruit;

public class MainDriver {
	
	@Override
	protected void finalize() {
		
	}
	
	public static void createObject() {
		Object o = new Object();
	}
	
	/*
	 * GC is the reason why we as programmers don't need to worry about memory allocation in creating and destroying objects. 
	 * 	Negliigent coding in this regard, leads to OutOFMemoryErrors. 
	 * 
	 * GC is a daemon thread (something that is always running in the background) - it's sole purpose to clear the Heap memoryu
	 * 	to free up some space for other objects. 
	 * 
	 * IT removes object that are eligible for removeal, what does it take for it to be eligible? 
	 * 		 UNREACHABEL OBJECTS. nullify, reassign, create objects in scopes that are no longer accesible. 
	 */
	
	public static int destroyedObject = 0;
	
	public static void main(String[] apples) {
		
		//Pass by value!
		int a = 1;
		int b = a;
		
		a = 2;
		
		//pass by reference!
		Fruit f1 = new Fruit(1);
		Fruit f2 = f1;
	
		
		f2.price = 100;
	
		Fruit f3 = f2;
		
		f3.price = 111;
		
		
		System.out.println(f1.price);
		
		while(true) {
//			System.out.println("Garbage collector stepping in!");
			new Fruit(1); //is not referenced by anthing, so it is eligible for garbage collection. 
		}
		
		
//		Object o1 = new Object();
//		Object o2 = new Object();
//		Object o3 = new Object();
//		
//		
//		//Reassign the reference
//		o2 = o1; //the original o2 object is now eligible for removal with GC
//		
//		//nullify the reference 
//		o3 = null;
//		
//		int a = null; primitives cannot be null
//		
//		//create a object within a method or a narrower scope that is no longer accessible
//		createObject();
//		
//		//An object becomes eligible for garbage collection when it loses any reference 
//		// one does not just invoke or call the garbage collector, it'll act on its own accord. 
//		// but one can suggest for it to start 
		
		Object o1;
		
		
		
		
	}

}
