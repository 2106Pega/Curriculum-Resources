package com.revature.service;

import java.util.List;

import com.revature.models.MenuItems;

public interface Kitchen {
	
	
	public List<MenuItems> allMenuItems();
	
	public List<MenuItems> foodMenu();
	
	public List<MenuItems> drinksMenu();
	
	

}
