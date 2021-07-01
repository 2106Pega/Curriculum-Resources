package com.revature.repo;

import java.util.List;

import com.revature.models.Fruit;

public interface FruitDAO {
	
	//Data Access Object 
	// Abstraction from the database
	// provides the CRUD methods for the rest of the project. 
	
	
	//Create
	public boolean insertFruit(Fruit f);
	
	//Read
	public Fruit selectFruitById(int id);
	public List<Fruit> selectFruitsByName(String name); 
	public List<Fruit> selectAllFruits();
	
	//Update 
	public void updateFruit(Fruit f);
	
	//Delete 
	public void deleteFruit(Fruit f);
}
