package com.revature.dao;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetDao {
	
	//CRUD
	//CREATE
	boolean insertPlanet(Planet p);
	
	//READ
	List<Planet> selectAllPlanets();
	List<Planet> ringedPlanetsOnlu();
	Planet selectPlanetByName(String name);
	Planet selectPlanetById(int id);
	
	//UPDATE
	boolean updatePlanetsRings(boolean ringStatus, int planetId);
}
