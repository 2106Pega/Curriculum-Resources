package com.revature.mydatastructures;

public interface Collection {
	
	/*
	 * I want Collection to be a flexible data structure for me 
	 * 
	 * What is a data structure?
	 * 		Store data. 
	 * 
	 * Most general data structure I can have. What methods do I need?
	 * 
	 * 
	 * insertion 
	 * 
	 * deletion 
	 * 
	 * somewhere to traverse over it. 
	 * 
	 * FIFO and LIFO 
	 * 
	 * 
	 * 
	 * What is a generic?
	 * 		Takes in a datatype. 
	 * 
	 */
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean add(String dataItem);
	
	public void print();

}
