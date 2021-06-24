package com.revature.inheritance;

public class Bird extends Animal {
	
	//Is bird inheriting the constructor?
	
	/*
	 * public Bird(){
	 * 		super(); 
	 * Classes chain call their constructors up to the Object class 
	 * }
	 */
	
	public Bird() {
		super("Animal",0);
	}
	
	
	public void makeSound() {
		
		
//		this.move();
//		super.move();
	}
	

}
