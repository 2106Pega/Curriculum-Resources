package com.revature;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import com.revature.controller.AuthController;
import com.revature.controller.AuthControllerImpl;
import com.revature.controller.HomeController;
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
	
	
	private static final String HOME_PATH = "/home";
	
	
	public static void main(String[] args) {
		
		
		
		Javalin app = Javalin.create(
				config -> {
					config.addStaticFiles("/public");
				}
			).start(9000);
		
		app.get("direct", ctx -> ctx.html("<h1>Hello there</h1>"));
		
		
		
		
		app.post(LOGIN_PATH, ctx -> authController.login(ctx));
		app.get(LOGIN_PATH, ctx -> authController.getPage(ctx));
		app.get("/logout", ctx -> authController.logout(ctx));
		app.get("checkUser", ctx -> authController.checkUser(ctx));
		
		app.get(PLANET_PATH, ctx -> planetController.getAllPlanets(ctx));
		app.post(PLANET_PATH, ctx -> planetController.postPlanet(ctx));
		app.post("/deletePlanet", ctx -> planetController.deletePlanet(ctx));
		app.put(PLANET_PATH, ctx -> planetController.updatePlanet(ctx));
		
		
		HomeController hm = (ctx) ->{
			
			
			
			if(authController.checkUser(ctx)) {
				try {
					RequestDispatcher redir = ctx.req.getRequestDispatcher("view-planets.html");
					redir.forward(ctx.req, ctx.res);
				} catch (ServletException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				ctx.redirect("login.html");
			}
			
			
			
		};
		
		app.get(HOME_PATH, ctx -> hm.getHome(ctx));
		
		
		//recreate the login method!
		//app.delete
		//app.put 
		
		
		//cookies and sessions and tokens!
	
		
		
	}

}
