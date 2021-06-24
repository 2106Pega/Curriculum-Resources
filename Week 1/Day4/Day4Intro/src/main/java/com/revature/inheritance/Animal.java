package com.revature.inheritance;

public class Animal {
	
	public String name;
	
	int weight;
	
	public Animal() {
		
	}
	
	
	public Animal(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	public void move() {
		System.out.println("I'm moving!");
	}
	
	
	@Override 
	public String toString() {
		
		return "Animal class: name = " + name;
	}
	
	@Override 
	public boolean equals(Object o) {
		
		Animal a = (Animal) o;
		
		boolean nameMatches = (this.name.equals(a.name));
		
		
//		a.name = "A fake name!";
		
		//String is objects
		// == compares our memory location 
		
		//We could do an instance of 
		
		//We can check if animal's fields is working 
		
		return nameMatches;
		
	}

	public boolean equals(Animal a) {
		return true;
	}
}
