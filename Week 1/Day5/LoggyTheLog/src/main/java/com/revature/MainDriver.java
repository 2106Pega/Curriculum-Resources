package com.revature;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public final class MainDriver {
	
	/*
	 * What is Logging?
	 * 
	 * 		When we finally complete our project in our IDE, we'd like to compile it into a distributable format. 
	 * 		Recording events while it occurs while the application executing. As users execute programs on the 
	 * 		client side (or server side), we can log the entries and behaviours to the suport team. 
	 * 
	 * 		This allows developers to access information about the app without being there or getting 
	 * 		"indirect" info from the user. 
	 * 
	 */
	
	private int aNumber;
	
	public static final void displayMenu() {
		
		/*
		 * ANything static can only invoke other static members 
		 * 		(without creating a brand new instance within the method block)
		 */
		
		
		
//		System.out.println("INFO: User viewed the Display Menu");
		
		loggy.setLevel(Level.INFO);
		loggy.info("User viewed the Display menu");
		loggy.setLevel(Level.WARN);
	}
	
	public void riskyMethod() {
		this.aNumber = 7;
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
			
			loggy.warn(e);
		}
	}
	
	static class NestedClass{
		
	}
	
	

	
	
	final static Logger loggy = Logger.getLogger(MainDriver.class);

	public static void main(String[] args) {
		
		MainDriver md1 = new MainDriver();
		
		NestedClass nested = new NestedClass();
		
		
		
		
		
		
		
		
//		DEBUG < INFO < WARN < ERROR < FATAL 
	
		loggy.setLevel(Level.WARN);
		
		displayMenu();
		
//		MainDriver.riskyMethod();
		
		MainDriver md = new MainDriver();
		md.riskyMethod();
		
		/*
		 * non-access modifiers 
		 * 		abstract 
		 * 		final 
		 * 		static 
		 * 
		 * 		when can I use the final keyword?
		 * 			variable:
		 * 				it means that the variable cannot be reassigned another value 
		 * 			method:
		 * 				It means that the method cannot be overriden.
		 * 			class:
		 * 				It means that the class cannot be extendended 
		 * 				(example of this is the String class)
		 * 
		 * 		static: 
		 * 			if used with a variable, all instances of the class share the same variable in memory. 
		 * 			static means that whatever it is, method, class, variable belongs to the class itself and 
		 * 			not to an object. (I don't need create an instance of the class to use the method)
		 * 			(variable, method and class)
		 * 			
		 */
		
		final String s = "Apple";
		
	}

}
