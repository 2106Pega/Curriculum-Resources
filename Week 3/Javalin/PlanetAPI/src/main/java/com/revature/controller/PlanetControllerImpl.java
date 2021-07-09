package com.revature.controller;

import com.revature.models.Planet;
import com.revature.service.PlanetService;
import com.revature.service.PlanetServiceImpl;

import io.javalin.http.Context;

public class PlanetControllerImpl implements PlanetController {

	private PlanetService planetService= new PlanetServiceImpl();
	
	@Override
	public void getAllPlanets(Context ctx) {
		// TODO Auto-generated method stub

		ctx.status(418);
		ctx.json(planetService.getAllPlanets());
		
		
	}

	@Override
	public void postPlanet(Context ctx) {

		String planetName = ctx.formParam("name");
		String description = ctx.formParam("description");
		boolean rings = Boolean.parseBoolean(ctx.formParam("rings"));
		
		Planet newPlanet = new Planet(0, planetName, description, rings, 0);
		
		System.out.println(newPlanet);
		if(planetService.createPlanet(newPlanet)) {
			ctx.status(201);
			ctx.redirect("http://localhost:9000/view-planets.html");
		}else {
			ctx.status(506);
		}
		
	}

}
