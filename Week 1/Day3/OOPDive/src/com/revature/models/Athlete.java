package com.revature.models;


//Is not a direct descendent of Object, it is also a Human. 
// This class can be a Human, Athlete or Object 
public class Athlete extends Human{
	
	public int fitnessLevel;
	
	public Athlete() {
		//super();
//		super("Generic Athlete"); //super is always the first line of code in the block. 
//		this.fitnessLevel = 5;
		this("Generic Athlete",5);
		
	}
	
	public Athlete(String name) {
//		super(name);
//		this.fitnessLevel = 5;
		
		this(name,5);
	}
	
	public Athlete(String name, int fitnessLevel) {
		super(name);
		this.fitnessLevel = fitnessLevel;
	}
	
	
	public void move() {
		
		super.move();
		System.out.println("I'm walking really fast");
	}
	
	public void jump() {
		System.out.println("I can jump!");
	}

}
