package com.revature.models.sorting;

import java.util.Comparator;

import com.revature.models.Food;

public class FoodComparatorByPrice implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		
		
		if( o1.getPrice() > o2.getPrice()) {
			return 1;
		}else if(o1.getPrice() < o2.getPrice()) {
			return -1000000;
		} else {
			return 0;
		}
	}

}
