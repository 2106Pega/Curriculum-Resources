package com.revature.presentation;

import java.util.List;

import com.revature.models.MenuItems;
import com.revature.service.Kitchen;

public class ShopFrontImpl implements ShopFront{
	
	private Kitchen cafeKitchen;
	
	public ShopFrontImpl(Kitchen cafeKitchen) {
		this.cafeKitchen = cafeKitchen;
	}

	@Override
	public void displayWelcome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMenu() {
		
		//What do I need to display menu???
		List<MenuItems> menuItemsList = cafeKitchen.allMenuItems();
		
		for(MenuItems m: menuItemsList) {
			System.out.println("Menu item : " + m.getName() );
		}
		
		//display menuitems by alphabetical order
		//first create a new comparator, define the method and the use it inside of a sort method. 
		
		//Java 8 introduced lambda expressions, to allow us to do more functional programming. 
		
		List<MenuItems> alphabeticalMenu = cafeKitchen.allMenuItems();
		
		alphabeticalMenu.sort(
				
				(MenuItems x,MenuItems y) -> {
						
					return x.getName().compareToIgnoreCase(y.getName());
		});
		
		List<MenuItems> priceOrderMenu = cafeKitchen.allMenuItems();
		
		priceOrderMenu.sort(
				(MenuItems x, MenuItems y) ->
				{
					Double priceOfX = x.getPrice();
					return priceOfX.compareTo(y.getPrice());
				}
				
				);
		
	}

	@Override
	public void displayFoodMenu() {
		//What do I need to display menu???
		List<MenuItems> menuItemsList = cafeKitchen.foodMenu();
				
		for(MenuItems m: menuItemsList) {
			System.out.println("Menu item : " + m.getName() );
		}
		
	}

	@Override
	public void displayDrinksMenu() {
		// TODO Auto-generated method stub
		
	}

}
