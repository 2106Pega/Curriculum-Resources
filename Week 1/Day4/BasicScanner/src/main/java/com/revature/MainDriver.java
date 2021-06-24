package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.exceptions.CustomBusinessException;
import com.revature.models.Food;
import com.revature.models.sorting.FoodComparatorByPrice;
import com.revature.models.sorting.FoodComparatorName;

public class MainDriver {
	
	public static List<Food> foodList = new ArrayList();
	
	public static void initialiseFoodList() {
		Food f1 = new Food("Apple", 1);
		Food f2 = new Food("Kiwi", 2);
		Food f3 = new Food("Banana", 0.5);
		Food f4 = new Food("Trifle", 5);
		Food f5 = new Food("Tomatoe", 1);
		
		foodList.add(f1);
		foodList.add(f2);
		foodList.add(f3);
		foodList.add(f4);
		foodList.add(f5);
		
	}
	
	public static void displayFood(List<Food> listOfFood) {
		
		for(Food i: listOfFood) {
			System.out.println("name " + i.getName() + " : price " + i.getPrice() + " : colour " + i.getColour());
		}
	}
	
	
	public static void main(String[] oranges) {
		
		/*
		 * I want to display items of food as a menu 
		 * 
		 * I want the user to be able to decide what order they'd like to see the food!
		 * (By name or by price)
		 * 
		 * 
		 */
		
		initialiseFoodList();
		
		displayFood(foodList);
		
		System.out.println("Above me is the food list, how would you like it ordered? ");
		System.out.println("Input 1 for order by name");
		System.out.println("Input 2 for order by price");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				
				List<Food> sortedByNameFoodList = new ArrayList();
				
				sortedByNameFoodList.addAll(foodList);
				
				sortedByNameFoodList.sort(new FoodComparatorName());
				
				displayFood(sortedByNameFoodList);
				
			}else if(input.equals("2")) {
				
				List<Food> sortedByPriceFoodList = new ArrayList();
				
				sortedByPriceFoodList.addAll(foodList);
				
				sortedByPriceFoodList.sort(new FoodComparatorByPrice());
				
				displayFood(sortedByPriceFoodList);
			}else {
				throw new CustomBusinessException();
			}
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			
			System.out.println("Invalid input");
			
		}
		
		
		
	}

}
