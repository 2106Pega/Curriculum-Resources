package com.revature;

import com.revature.controller.AuthController;
import com.revature.controller.AuthControllerImpl;
import com.revature.controller.PlanetController;
import com.revature.controller.PlanetControllerImpl;
import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImpl;

import io.javalin.Javalin;

public class MainDriver {
	
	private static final String LOGIN_PATH = "/login";
	private static AuthController authController = new AuthControllerImpl();
	
	private static final String PLANET_PATH = "/planet";
	private static PlanetController planetController = new PlanetControllerImpl();
	
	public static void main(String[] args) {
		
		
		
		Javalin app = Javalin.create(
				config -> {
					config.addStaticFiles("/public");
				}
			).start(9000);
		
		
		app.post(LOGIN_PATH, ctx -> authController.login(ctx));
		app.get(PLANET_PATH, ctx -> planetController.getAllPlanets(ctx));
		app.post(PLANET_PATH, ctx -> planetController.postPlanet(ctx));
		
		//recreate the login method!
		//app.delete
		//app.put 
		
		
		//cookies and sessions and tokens!
	
		
		
	}

}
