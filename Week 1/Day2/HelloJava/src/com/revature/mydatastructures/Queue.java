package com.revature.mydatastructures;

public interface Queue extends Collection {
	
	/*
	 * What is a queue?
	 * 		First in first out, Last in last out. 
	 * 		Stores in the tail and head. 
	 * 		It's ordered 
	 * 		Can only retrieve elements in a certain order
	 * 		Queues are not indexed. 
	 */

//	DEPRECATED
//	public void remove(); //will always removed form the head of the list. 
	
	public String pop(); //will remove the item and gives it to us. 
		
	public String peek(); //view the head without removing it 
	
}
