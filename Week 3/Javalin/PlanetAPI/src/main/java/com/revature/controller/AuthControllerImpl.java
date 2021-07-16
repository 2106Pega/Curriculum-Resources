package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

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
			

			ctx.redirect("/home");
			//if user doesn't exists you'd set it to 407 
			
			
		}else {
			
		
		}
		
		System.out.println(username);
		System.out.println(password);

	}

	
	@Override
	public void logout(Context ctx) {
		ctx.clearCookieStore();
	
		
		
		ctx.redirect("/login");
		
	}

	@Override
	public boolean checkUser(Context ctx) {
		
		return authService.validateToken(ctx.cookieStore("user"));
	}


	@Override
	public void getPage(Context ctx) {

		RequestDispatcher redir = ctx.req.getRequestDispatcher("login.html");
		
		try {
			redir.forward(ctx.req, ctx.res);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
