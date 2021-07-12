package com.revature.service;

import java.util.List;

import com.revature.models.Planet;

public interface PlanetService {
	
	public List<Planet> getAllPlanets();
	
	public Planet getPlanetByName(String name);

	public boolean createPlanet(Planet newPlanet);
	
	boolean deletePlanet(Planet p);
	
	boolean updatePlanet(Planet p);

	public boolean updatePlanet(Planet p, boolean rings);
	
	

}
