package com.revature.mydatastructures;

public interface Collection<T> {
//	<T> is a placeholder for my data objects, I can accept any object type but still retain it's type identity. 
//	Also ensures type saftey, so different object types don't get passed through. 
	
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
	 * 
	 * 
	 * 		Takes in a datatype. 
	 * 
	 */
	
	public boolean isEmpty();
	
	public int size();
	
	public boolean add(T dataItem);
	
	public void print();

}
