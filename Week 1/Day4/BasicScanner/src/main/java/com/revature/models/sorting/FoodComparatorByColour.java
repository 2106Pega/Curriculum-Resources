package com.revature.models.sorting;

import java.util.Comparator;

import com.revature.models.Food;

public class FoodComparatorByColour implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
	
		if(o1.getColour().equals("yellow")) {
			return 1;
		}else if(o2.getColour().equals("blue")) {
			return -1;
		}
		return 0;
	}

}
