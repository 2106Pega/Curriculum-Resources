package com.revature;

import java.util.HashSet;
import java.util.Set;

import com.revature.inheritance.Animal;

public class MainDriver {
	
	/*
	 * 
	 * What is the Object class?
	 * 
	 * 		
	 * 
	 * 		It contains several methods 
	 * 			toString()
	 * 			equals()
	 * 			hashCode() : generates a unique number which is a hash code. 
	 * 			(threading methods)
	 * 			finalize()
	 * 			getClass: Treturn the class of "this" object
	 * 
	 * 		It's a base, we build all of our objects of it. Object class is an ancestor to every object we make. 
	 * 		A class is either a direct descendent (like Animal) or an indirect descendent (Like Bird)
	 */
	
	public static void main(String[] tomatoes) {
		
		Animal a = new Animal("Bob",1);
		
		
		Animal b = new Animal("Bob",2);
		
		Animal c = new Animal("Charlie",3);
		
		Animal d = a; 
		
		d.name = "Tammy";
		
//		System.out.println(a);
//		
//		Object o = new Object();
//		
//		System.out.println(a); //memory address 
//		//We are implicilty using the toString method whenever we use System.out.println();
//		//By default, the Object class will print out the memory location of the object. 
//		
//		System.out.println(a == b); //false 
//		//They will be checking the memory location of objects
//		
//		System.out.println(a.equals(b)); //true 
//		// They were doing the exact same thing. 
//		// Now we've override the equals method to make it more useful 
//		
//		
//		System.out.println(a.equals(c)); //We'll throw an exception if it's not an animal 
//		System.out.println(c);
//		
//		
//		Set<Animal> setOfAnimals = new HashSet<Animal>();
//		
//		setOfAnimals.add(a);
//		setOfAnimals.add(a);
//		setOfAnimals.add(b);
//		
//		System.out.println(setOfAnimals);
		
		
		
		///////////////////////////STRINGS
		
		
		/*
		 * What is String in Java?
		 * 		
		 * 		String is an object that contains an array of characters. It allows us to create and 
		 * 		manipulate strings/characters. 
		 * 
		 * 		An object, not a primitive. 
		 * 		It has its own method, that you can mess around with. 
		 * 		
		 * 		It's an immutable object (and the class is final), you can't update an exact instance. 
		 */
		
//		String string1 = new String("Hello!");
//		
//		String string2 = "Hello!";	//DataType variableName = "String literal";
//		String string3 = "Hello!";
//		
//		string3 = "Hi!";
//		string3 = "Hi";
//		
//		System.out.println(string2 == string3 );
		
//		String string1 = "Apples";
		
		String string2 = "Apples";
		
		string2 = "Kiwi";
		
		string2 = "Apples";
		
		string2 = string2.toUpperCase(); //Creating a new object in memory , "APPLES"
		
		System.out.println(string2.toLowerCase());
		
		String string3 = new String("Apples"); //; a new memory location
		
		string3.toUpperCase();
		
		string3.toLowerCase();
		
		System.out.println("String 3 " + string3);
		
		String string4 = "Apples";
		
		
//		System.out.println(string4 == string3);
		
		
		/*
		 * Make sure to know some of the String methods 
		 * 
		 * 			.loweCase()
		 * 			.upperCAse()
		 * 			.length()
		 * 			.concat()
		 * 			.split()
		 */
		
		
		String[] breakMyComputer = new String[Integer.MAX_VALUE - 1];
		
		int i = 0;
		while(true) {
			
			breakMyComputer[i] = " New string " ;
			
			i++;
			
		}
		
		/*
		 * 
		 * StringBuilder and StringBuffer. 
		 * 
		 * String vs StringBuilder.
		 * 		What are the difference in use 
		 * 		Why would we use one over the other. 
		 * 
		 * StringBuilder vs StringBuffer
		 */
	}

}
