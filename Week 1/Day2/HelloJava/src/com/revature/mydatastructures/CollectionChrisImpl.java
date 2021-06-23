package com.revature.mydatastructures;

public class CollectionChrisImpl implements Collection{
	
	Object[] hiddenDataStructure;

	
	public CollectionChrisImpl(){
		hiddenDataStructure = new String[0];
		//Whenever we instantiate a CollectionImpl, we instantiate a array of length 1. 
	}

	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean add(String dataItem) {

//		int insertionIndex = this.hiddenDataStructure.length - 1; // We want to find the position of where to insert to. 
		
//		int insertion = 0; // first element of our array 
		
		
		Object[] newArray = new Object[this.hiddenDataStructure.length + 1]; //I'm going to create a new array with one extra position. 
		
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
		
		for(Object dataItem: this.hiddenDataStructure) {
			System.out.println(dataItem);
		}
		
	}



	@Override
	public boolean add(Object dataItem) {
		// TODO Auto-generated method stub
		return false;
	}

}
