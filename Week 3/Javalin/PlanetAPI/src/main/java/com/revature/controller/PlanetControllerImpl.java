package com.revature.controller;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.jetty.util.ajax.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

	@Override
	public void updatePlanet(Context ctx) {
		
//		Planet p = (Planet) JSON.parse(ctx.body()); //we're not sending just parameters, we're sending a JSON representaiton of our Planet
								//we're using Jackson, to demarshal our JSON into a Java object. 
		
		System.out.println((HashMap<String, String>) JSON.parse(ctx.body()));
		
		ObjectMapper om = new ObjectMapper();
		
		Planet p;
		try {
			p = om.readValue(ctx.body(), Planet.class); //json information 
			boolean rings = p.isRings();
		
			p = planetService.getPlanetByName(p.getName()); //full database object 
				
			planetService.updatePlanet(p,rings); //change the database objects
			
			ctx.status(999);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		HashMap<String, String> hMap = (HashMap<String, String>) JSON.parse(ctx.body());
		
//		Planet p = new Planet();
//		p.setName(hMap.get("name")); //This planet only has the name
//		
//		System.out.println(p);
//			System.out.println((Planet) JSON.parse(ctx.bodyAsInputStream()));
		
//		// {key:value} JSON
//		// [{< key???:?<value>? }] Ben's patent pending foramt
//		// setting status codes to succes as 404 
//		
//		p = planetService.getPlanetByName(p.getName()); //makes sure that our planet is consistent with our database. 
//		p.setRings(Boolean.parseBoolean(hMap.get("rings")) ); //update the planet
//		
//		planetService.updatePlanet(p); //persist the change
//
//		ctx.status(200);

		
		
		
	}

	@Override
	public void deletePlanet(Context ctx) {

		String planetName = ctx.formParam("name");
		
		Planet p = planetService.getPlanetByName(planetName);
		
		if(!planetService.deletePlanet(p)) {
			ctx.status(418);
			ctx.html("<h1>Planet does not exist to destroy!</h1>");
		}else {
			ctx.status(200);
			ctx.redirect("view-planets.html");
		}
		
	}

	@Override
	public void deletePlanetWithJSON(Context ctx) {
		// TODO Auto-generated method stub
		
	}

}
