package com.revature.mydatastructures;

public interface List extends Collection{
	
	/*
	 * Homogenous inhertiance : extends 
	 * 		Class -> Class
	 * 		Interface -> Interface
	 * 		Abstract Class -> Class 
	 * 
	 * Hetrotegenous inheritance: implements 
	 * 		Interface -> Class 
	 * 		
	 */
	
	
	// What is a List?
	// List is a bit more flexible, it manages more memory. 
	// Lists are indexed. 
	
	public boolean add(String dataItem, int index);
	
	public boolean addAll(List itemList);
	
	public boolean contains(String s);
	
	public String itemAtIndex(int index);  //get the item at a position
	
	public int indexOf(String item); //get the item's index 
	
	public boolean remove(int index); 
	
	public void removeAll();
	
	//Levaraging Polymorphsim. 
	//We want a method to be flexible in taking different arguments. 
	
	public boolean remove(String item);
	
	
	
	

}
