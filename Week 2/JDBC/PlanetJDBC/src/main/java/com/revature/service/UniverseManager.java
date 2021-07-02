package com.revature.service;

import java.util.List;

import com.revature.models.Planet;

public interface UniverseManager {

	boolean authenticate(String user);

	List<Planet> getAllPlanets();

}
