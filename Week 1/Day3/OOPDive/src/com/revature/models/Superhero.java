package com.revature.models;

//IS-A object, human, athlete and superhero
public class Superhero extends Athlete{
		//Athelte provides a no args constructor, so our child class does not complain 
	
	/*
	 * public Superhero(){
	 * 	super();
	 * };
	 */
	
//	@Override //isn't neceassry to override, but it'll inform us if we're not overriding. 
//	public void move() { 
//		super.move();
//		
//		System.out.println("I can also fly");
//	}
	
//	public void ability() {
//		System.out.println(this.name + " has a lot of strength");
//	}
}
