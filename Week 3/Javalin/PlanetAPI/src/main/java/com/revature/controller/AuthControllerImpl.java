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
			
			ctx.status(200);
			
			ctx.cookieStore("user",authService.createToken(username));
			
			
			ctx.redirect("view-planets.html");
			//if user doesn't exists you'd set it to 407 
			
			
		}else {
			
			ctx.status(507);
			ctx.redirect("login.html");
		}
		
		System.out.println(username);
		System.out.println(password);

	}

	
	@Override
	public void logout(Context ctx) {
		ctx.clearCookieStore();
		System.out.println("hi!");
		ctx.redirect("login.html");
		
	}

	@Override
	public boolean checkUser(Context ctx) {
		
		return authService.validateToken(ctx.cookieStore("user"));
	}

}
