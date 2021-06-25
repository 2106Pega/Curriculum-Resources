package com.revature.repository;

import java.awt.MenuItem;
import java.util.List;

import com.revature.exceptions.FoodDoesntExist;
import com.revature.models.MenuItems;

public interface Cooler {
	
	//This will be a "storage" for all of our items.
	//Right now we'll a static list
	//I'll show serialization
	//in the future we'll use this class to communicate with our DB
	
	
	//CRUD
	
	//CREATE
	public boolean addToCooler(MenuItems m);
	
	//READ
	public MenuItem selectMenuItemByName(String name) throws FoodDoesntExist;
	public List<MenuItems> selectAllMenuItems();
	
	
	//UPDATE
	
	//DELETE
	public default boolean removeMenuItems(MenuItems m) {
		
		//The default keyword allows us to create concrete methods in Interfaces 
		
		return false;
		
	}
	

}
