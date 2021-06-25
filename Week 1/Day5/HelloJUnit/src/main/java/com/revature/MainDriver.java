package com.revature;

public class MainDriver {
	
	public static void randomeMEthod() {
		
	}
	
	/*
	 * What is testing?
	 * 			
	 * 			Ensure our code works 
	 * 			Helps with debugging
	 * 			Good practice to have it before launching the code into production 
	 * 			Allows us to not lose scope of client specifications. 
	 * 
	 * 
	 * Types of testing?
	 * 
	 * 		Automation testing
	 * 		manual testing
	 * 		integration testing 
	 * 		function testing 
	 * 		Regression testing
	 * 		stress testing 
	 * 		smoke testing
	 * 
	 * 		Unit testing 
	 * 
	 * Unit testing?
	 * 		testing in isolation the smallest unit of code. In Java, this is a method. 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(1.0/0.0);
		
		randomeMEthod();
		MainDriver.randomeMEthod();
	}

}
