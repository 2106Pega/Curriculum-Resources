package com.revature.model;

import com.revature.MainDriver;

public class Fruit {
	
	public double price;
	
	public Fruit(double price) {
		this.price= price;
	}
	
	
	@Override
	protected void finalize() {
		
		//This method is invoked by the garbage collector, just before it destory object from meory 
		System.out.println("Final message from Fruit " + MainDriver.destroyedObject);
		MainDriver.destroyedObject++;
	}

}
