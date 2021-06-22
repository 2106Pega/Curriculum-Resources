package com.revature.mydatastructures;

public abstract class CollectionImpl implements Collection{
	
	/*
	 * What's the only native data structure we have, arrays 
	 */

	private String[] hiddenDataStructure;

	
	public CollectionImpl(){
		hiddenDataStructure = new String[0];
		//Whenever we instantiate a CollectionImpl, we instantiate a array of length 1. 
	}
	
	@Override
	public abstract boolean isEmpty();

	@Override
	public abstract int size();

	@Override
	public boolean add(String dataItem) {

//		int insertionIndex = this.hiddenDataStructure.length - 1; // We want to find the position of where to insert to. 
		
//		int insertion = 0; // first element of our array 
		
		
		String[] newArray = new String[this.hiddenDataStructure.length + 1]; //I'm going to create a new array with one extra position. 
		
		for(int i = 0; i < this.hiddenDataStructure.length; i++) {
			newArray[i] = this.hiddenDataStructure[i]; //we're copying over!
		}
	
		newArray[newArray.length -1 ] = dataItem;
		
		this.hiddenDataStructure = newArray;
		
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		for(String dataItem: this.hiddenDataStructure) {
			System.out.println(dataItem);
		}
		
	}

}
