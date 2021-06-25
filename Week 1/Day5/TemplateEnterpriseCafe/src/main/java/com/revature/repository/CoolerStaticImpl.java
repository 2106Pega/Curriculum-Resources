package com.revature.repository;

import java.awt.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.revature.exceptions.FoodDoesntExist;
import com.revature.models.MenuItems;

public class CoolerStaticImpl implements Cooler{
	
	private static Set<MenuItems> frozenFood;

	@Override
	public boolean addToCooler(MenuItems m) {
		
		return frozenFood.add(m);
	}

	@Override
	public MenuItem selectMenuItemByName(String name) throws FoodDoesntExist{
		// TODO Auto-generated method stub
		
		throw new FoodDoesntExist();
		
	}

	@Override
	public List<MenuItems> selectAllMenuItems() {
		// TODO Auto-generated method stub
		
		List<MenuItems> foodList = new ArrayList<>();
		foodList.addAll(frozenFood);
		return foodList;
	}

}
