package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Fruit;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class ServerDriver {
	
	public static List<Fruit> myListOfFruits = new ArrayList<>();

	static void addNewFruit(Context ctx) {
		myListOfFruits.add(new Fruit("Blueberry", 5.0));
		
		ctx.status(201);
	}
	
	public static void main(String[] args) {
		
		
		


		Javalin app = Javalin.create(
					config -> {
						config.addStaticFiles("/public");
					}
				).start(9010);
		
		//context
		String variable = "Fruit";
		
		// url: <domain>/hello = localhost:9010/hello
		// The server will handle a get request to that URL 
		app.get("/hello", ctx -> ctx.html("Hello World, Hello Jetty, HEllo Javalin! " + variable) );
		app.put("/another", contex -> contex.html("As anything we want"));
		app.post("/hello", ctx -> ctx.html("We're in post"));
		
		Fruit a = new Fruit("Apple", 1.0);
		myListOfFruits.add(a);
		
		// get, post, put and delete 
		app.get("/fruits", ctx -> ctx.json(myListOfFruits));
		app.delete("/fruit", ctx -> addNewFruit(ctx));
//		app.put("/fruit", null);
		app.post("/fruit", ctx -> {
			
			myListOfFruits.remove(myListOfFruits.size() - 1);
			
		});
		
		
		

	}

}
