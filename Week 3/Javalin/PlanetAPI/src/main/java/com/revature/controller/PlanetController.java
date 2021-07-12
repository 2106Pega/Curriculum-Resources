package com.revature.controller;

import io.javalin.http.Context;

public interface PlanetController {
	
	public void getAllPlanets(Context ctx);
	
	
	public void postPlanet(Context ctx);
	
	void updatePlanet(Context ctx);
	
	void deletePlanetWithJSON(Context ctx);
	
	void deletePlanet(Context ctx);

}
