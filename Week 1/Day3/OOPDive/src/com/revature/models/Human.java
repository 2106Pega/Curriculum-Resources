package com.revature.models;

//Human is a direct descendent of Object class 
//This is done impliclity 
public class Human extends Object {
	
	/*
	 * What does this class contain?
	 * 		variables
	 * 		methods
	 * 		constructor 
	 * 
	 * We don't inherit constructors, we chain call our construcotrs. 
	 */
	
	public String name;

	//When we don't have a constructor
	// The JVM provides us with a default constructor 
	// (it is essentially a no-args constructor that will instantiate the object in memory, but nothing else)
	
	//When I provide a constructor, the JVM will not bother.
	public Human(String name) {
		
		super(); //object has a no args constructor that we can invoke!
		
		this.name = name;
	}
	
	
	 public void move() {
		
		System.out.println("I'm walking");
	}
	
	public int add(int number) {
		return 0;
	}
	
	public int add(int number, int otherNumber) {
		this.add(number, otherNumber, "Apples");
	
//		add(number,otherNumber,"Apples");
		
		return 0;
	}
	
	
	public void add(double otherNumber, int number) {
//		return otherNumber + number;
		
	}
	
	public void add(int number, double Othernumber) {
		
	}
	
	public void add(int number, int otherNumber, String stringVariable) {
		System.out.println(stringVariable);
//		return number +otherNumber;
	}
	
	
	/*
	 * I can overload by mixing up my parameters:
	 * 
	 * 		We can change the datatypes of the parameters. 
	 * 		We can have a different number of parameters. 
	 * 		We can change the order of the parameters in our method signatures. 
	 * 		
	 */

}
