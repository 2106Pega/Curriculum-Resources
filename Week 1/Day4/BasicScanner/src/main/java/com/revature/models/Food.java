package com.revature.models;

import java.util.Objects;

public class Food {
	
	/*
	 * pojo : plain old java object 
	 */

	private String name;
	private double price;
	private String colour;
	
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String name, double price) { //all args constructor
		super();
		this.name = name;
		this.price = price;
	}
	
	
	
	public Food(String name, double price, String colour) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", colour=" + colour + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	
	
	
	
	
	
}
