package com.revature;

import java.util.List;

import com.revature.models.Fruit;
import com.revature.repo.FruitDAO;
import com.revature.repo.FruitDaoImpl;

public class MainDriver {
	
	public static void main(String[] args) {
		
		Fruit f = new Fruit(0, "Apple", "Red and Round", 1.50);
		
		FruitDAO fDao = new FruitDaoImpl();
		
		fDao.insertFruit(f);
		
		List<Fruit> persistedApples = fDao.selectFruitsByName("Apple");
		
		System.out.println(persistedApples);
		
	}

}
