package com.revature.models;

public class Fruit {
	
	private String name;
	private double price;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
	

}
