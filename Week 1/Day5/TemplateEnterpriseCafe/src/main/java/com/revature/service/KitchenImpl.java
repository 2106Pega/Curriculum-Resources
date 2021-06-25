package com.revature.service;

import java.util.List;

import com.revature.models.MenuItems;
import com.revature.repository.Cooler;

public class KitchenImpl implements Kitchen {
	
	private Cooler cooler;
	
	

	public KitchenImpl(Cooler cooler) {
		super();
		this.cooler = cooler;
	}

	@Override
	public List<MenuItems> allMenuItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItems> foodMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MenuItems> drinksMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}
