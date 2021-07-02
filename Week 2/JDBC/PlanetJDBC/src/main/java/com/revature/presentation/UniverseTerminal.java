package com.revature.presentation;

import java.util.List;
import java.util.Scanner;

import com.revature.models.Planet;
import com.revature.service.UniverseManager;

public class UniverseTerminal {
	
	UniverseTerminal uT;
	
	UniverseManager uM;
	
	public void displayWelcomeMenu() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to my universe manager ");
		System.out.println("Are you a mortal or not? (yes/no)");
		
		String mortalString = sc.nextLine();
		
		sc.close();
		
		switch(mortalString.toLowerCase()) {
		case "yes":
			uT.mortalMenu();
			break;
		case "no":
			uT.actualMenu();
			break;
		default: 
			System.out.println("Option is not valide, please leave the terminal.");
			
		}
		
		
		
		
	}

	private void actualMenu() {

		System.out.println("Welcome to the real deal");
		System.out.println("First of all we need to check if you exist!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your username!");
		String user = sc.nextLine();
		
		if(uM.authenticate(user)) {
			
			System.out.println("Welcome " + user);
			
			boolean userActive = true;
			
			while(userActive) {
				System.out.println("What would you like to do? ");
				System.out.println("Here is a list of all the planets!");
				
				uT.displayAllPlanets();
				
				System.out.println("What would you like to do??");
				System.out.println("1) Destroy a planet");
				System.out.println("2) Create Planet ");
				System.out.println("3) Modify a planets ring structure");
				System.out.println("4) Leave the Universe App");
				
				String userChoice = sc.nextLine();
				
				switch(userChoice.toLowerCase()) {
				case "1":
					System.out.println("Not implemented yet!");
					break;
				case "2":
					System.out.println("Not implemented yet!");
					break;
				case "3":
					System.out.println("Not implemented yet!");
					break;
				case "4":
					userActive = false;
					break;
				default: 
					System.out.println("Option is not valid, try again!");
					
				}
				
				System.out.println("Thank you for interacting with our app!");
			}
			
			
			
		}
		
	}

	private void displayAllPlanets() {


		List<Planet> planetList = uM.getAllPlanets();
		
		for(Planet p: planetList) {
			System.out.println(p.getName());
		}
		
	}

	private void mortalMenu() {

		System.out.println("You're mortal, so you don't get any choicess on how to manipulate planets!");
		
	}

	
}

