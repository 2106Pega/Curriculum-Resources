package com.revature;

import com.revature.mydatastructures.Collection;
import com.revature.mydatastructures.CollectionChrisImpl;
import com.revature.mydatastructures.FullCollectionImpl;
import com.revature.mydatastructures.PerformanceImpl;

public class MainDriver {
	
	/*
	 * What is Java?
	 * 		Programming language based on C
	 * 		Object Oriented 
	 * 		Statically typed 
	 * 		Partially compiled and partially interpreted 
	 * 		Cross platform 
	 * 		
	 * What do we do with Java?
	 * 		Software stuff 
	 * 		Can use for games (not suited)
	 * 			C++ handles memories better 
	 * 		Usage in web applications and web development 
	 * 		Used in android development 
	 * 		Nearly 75% software is based on Java
	 * 			e.g. the car player is based on Java
	 * 		Older games can be based on Java 
	 * 
	 * 
	 * Java is used in an enterprise setting. 
	 * 
	 * Why is Java useful in an enterprise setting?
	 * 	
	 * 		WORA (Write Once Run Anywhere). Thanks to the JVM, any system that can support the JVM can run Java code. 
	 * 
	 * 		Object Oriented Programming support. Inheritance, Encapsulation, Polymorphism, Abstraction.
	 * 
	 * 		Java is simple to learn, based on C. 
	 * 
	 * 		Garbage collection - automated memory management. 
	 * 			(Java is secure, lack of manual memory managed means less cahnce of security flaws, e.g. stack corruption)
	 * 
	 * 		Java is open source. Lots of tools and IDEs, many frameworks, open source libraries. 
	 * 			Lots and lots of documentation)
	 * 		
	 * 		
	 */
	
	public static void main(String[] args) {
		
		/*
		 * How we can program in Java!
		 * 
		 * 		We'll need the JVM to run it. 
		 * 
		 * 		We'll also need a text editor
		 * 
		 * 		The compiler, to compile our human readable code into bytecode 
		 * 
		 * 
		 * What we need is the JDK:
		 * 		Java Development Kit contains the JRE. 
		 * 
		 *		Java Runtime Environment, contains the JVM. 
		 *
		 *		Java Virtual Machine 
		 * 
		 * 
		 * 
		 * What is the Java Virtual Machine?
		 * 		It allows us to apply WORA, make our Java application cross platform. 
		 * 
		 * 		The JVM translates bytecode into machine code for us. It abstracts away the process of communicating 
		 * 			with our system. It also handles memory management. 
		 * 
		 * 
		 * What is the Java Runtime Environemnt? 
		 * 		
		 * 		JRE contains the JVM to allow us to run our application and core libraries. 
		 * 
		 * What is the Java Development Kit?
		 * 	
		 * 		JDK allows us to build and run our java applications, so it'll contain the JRE. 
		 * 		We're also going to have a compiler. 
		 * 			Compiler, compiles our human readable code into bytecode. 
		 * 		Also contains a debugger. 
		 * 			
		 * 
		 * 
		 */
		
		/*
		 * I'll be looking data structures and how to create my own, using OOP. 
		 * 
		 * Set up our own List, Set and Queue. 
		 */
		
		
		
		
		/*
		 *I want to build a basic Cafe application  
		 *
		 *First of all I need a way to store all the food items in the order. 
		 */
		
		//What is the array?
		// A set of items of fixed length
		// It's indexed 
		// They have to be of the same type
		
		//Classes are written with a capital first 
		String stringVariable; //declaration 
//		stringVariable = 2; //variables have to store the same type of data 
		stringVariable = "String literal"; // assignment 
		
		
		String food1 = "Apples";
		String food2 = "Kiwi";
		String food3 = "Banana";
		
		String[] oneLineFoodList = {food1,food2,food3}; //declaring and initalising and assigning food objects. 
		
		String[] foodList =new String[3]; //declararing and initalising a new empty array of length 3
		
		foodList[0] = food1;
		foodList[1] = food2;
		foodList[2] = food3;
		
//		System.out.println(foodList); //this will print out the memory address 
		
		
//		for(int i = 0;i<foodList.length;i++) {
//			System.out.println(foodList[i]);
//		}
//		
//		foodList = new String[4];
//		
//		for(String foodIt: foodList) {
//			System.out.println(foodIt);
//		}
		
		
		CollectionChrisImpl foodCollection = new CollectionChrisImpl();
		
		
		
		foodCollection.add(food1); 
		foodCollection.add(food2); 
		foodCollection.add(food3); 
//		foodCollection.add(food4); 
//		foodCollection.add(food5); 
//		foodCollection.add(food6); 
		
//		foodCollection.hiddenDataStructure = null; //encapsulation is to stop other developers from doing dangerous operations. 
		
		//other developers?
		// cafe developer (me) doesn't know how Collection works. 
		// I see no delete method! so I'll set everything to nnull 
		// my way of deleting everything!
		
		
		foodCollection.print();
	
		
	}

}
