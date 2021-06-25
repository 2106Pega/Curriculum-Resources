package com.revature.models;

import java.io.Serializable;

public class MenuItems implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4966065663196603213L;
	
	
	private String name;
	private double price;
	private boolean isFood;
	public MenuItems(String name, double price, boolean isFood) {
		super();
		this.name = name;
		this.price = price;
		this.isFood = isFood;
	}
	public MenuItems() {
		super();
		// TODO Auto-generated constructor stub
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
	public boolean isFood() {
		return isFood;
	}
	public void setFood(boolean isFood) {
		this.isFood = isFood;
	}
	@Override
	public String toString() {
		return "MenuItems [name=" + name + ", price=" + price + ", isFood=" + isFood + "]";
	}
	
	

}
