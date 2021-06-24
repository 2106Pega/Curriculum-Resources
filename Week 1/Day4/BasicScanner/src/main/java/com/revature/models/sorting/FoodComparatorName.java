package com.revature.models.sorting;

import java.util.Comparator;

import com.revature.models.Food;

public class FoodComparatorName implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		
		return o1.getName().compareTo(o2.getName()); // positve, 0 , negative 

	}


	

}
