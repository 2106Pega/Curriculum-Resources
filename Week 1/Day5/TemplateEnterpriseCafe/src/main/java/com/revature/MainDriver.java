package com.revature;

import com.revature.presentation.ShopFront;
import com.revature.presentation.ShopFrontImpl;
import com.revature.repository.Cooler;
import com.revature.repository.CoolerSerialization;
import com.revature.repository.CoolerStaticImpl;
import com.revature.service.Kitchen;
import com.revature.service.KitchenImpl;

public class MainDriver {
	
	public static void main(String[] args) {
		
		
		/*
		 * 3 tier architecture 
		 * 
		 * Presentation layer 
		 * 		|
		 * Service layer 
		 * 		|
		 * Database/Repository layer 
		 * 
		 * Model layer 
		 * 
		 * utility layer 
		 */
		
		Cooler cooler = new CoolerStaticImpl();
		Kitchen kitchen = new KitchenImpl(cooler);
		ShopFront shopFront = new ShopFrontImpl(kitchen);
		
		
		CoolerSerialization cs = new CoolerSerialization();
		
		cs.actallySerializing();
		
//		shopFront.displayMenu();
	}

}
