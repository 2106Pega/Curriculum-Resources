package com.revature.controller;

import com.revature.service.AuthService;
import com.revature.service.AuthServiceImpl;

import io.javalin.http.Context;

public class AuthControllerImpl implements AuthController {
	
	private AuthService authService= new AuthServiceImpl();

	@Override
	public void login(Context ctx) {
		// TODO Auto-generated method stub
		
		//pokeapi, we didn't send anything, we went to an exact endpoint /pokemon/1 or /pokemon/2 
		
		String username = ctx.formParam("username");
		String password = ctx.formParam("password");
		
		if(authService.authenticateUser(username, password)) {
			
			ctx.status(418);
			
			
		}else {
			
			ctx.status(507);
			ctx.redirect("https://javalin.io/");
		}
		
		System.out.println(username);
		System.out.println(password);

	}

}
