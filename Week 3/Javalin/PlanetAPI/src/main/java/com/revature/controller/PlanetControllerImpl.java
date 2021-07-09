package com.revature.controller;

import com.revature.service.PlanetService;
import com.revature.service.PlanetServiceImpl;

import io.javalin.http.Context;

public class PlanetControllerImpl implements PlanetController {

	private PlanetService planetService= new PlanetServiceImpl();
	
	@Override
	public void getAllPlanets(Context ctx) {
		// TODO Auto-generated method stub

		ctx.json(planetService.getAllPlanets());
		
		
	}

}
