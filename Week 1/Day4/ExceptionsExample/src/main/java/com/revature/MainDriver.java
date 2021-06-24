package com.revature;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainDriver {
	
	public static void brokenMethod() throws Exception {
//		String[] a = new String[0];
//		
//		System.out.println(a[100]);
		
		List<Object> a = new ArrayList();
		
		a.get(100);
		
		throw new Exception();
		
	}
	
	public static void callingBrokenMethod() throws Exception {
		
		brokenMethod();
	}
	
	public static void superSafeMethod() {
		
		System.out.println("Inside safe message!");
	}
	
	
	public static void dangerousMethod(String colour) throws IOException, ColourException{
		
		if(colour.toLowerCase().equals("yellow")) {
			
//			System.out.println("Don't put in the colour yellow!");
			
			throw new ColourException();
		
		
		}else {
			System.out.println("Well done on your colour choice ");
		}
		
	}
	
	public static void perfectlySafeMethod() throws SQLException{
		
	}
	
	public static void main(String[] watermelons) {
		
		
		/*
		 * throwable vs throws vs throw 
		 * 
		 * finally vs final vs finalize
		 */
		
		
		try {
			dangerousMethod("yellow");
			 
		} catch (IOException | ColourException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} finally {
			
			/*
			 * This is the portion of code that is (hopefully) very safe 
			 * 
			 * this will be required to execute regardless of whether the "try" code worked!
			 */
		}


		try {
			superSafeMethod();
			 
		}finally {
			
			/*
			 * This is the portion of code that is (hopefully) very safe 
			 * 
			 * this will be required to execute regardless of whether the "try" code worked!
			 */
		}
		
		/*
		 * You can't have a try block on its own but 
		 * you can have a try catch, try catch finally and a try finally 
		 */
	}
		
		
		
//		try {
//			callingBrokenMethod();
//		} catch (Exception e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		
//		
//		try {
//			perfectlySafeMethod();
//		} catch (SQLException e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		
//		/*
//		 * 
//		 * How to handle exceptions!
//		 * 
//		 *  try catch blocks. 
//		 *  
//		 *  we can shift the responsibility by declaring the method will throw the exception. 
//		 */
//		
//		
//		try {
//			dangerousMethod("yellow");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} //With Checked exceptions (direct children of Exception class), you're forced to handle it!
//		// Checked excpetions are believed to by likely to happen, hence you should be forced to handle it. 
//		catch (ColourException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//RuntimeExceptions are less likely to occur, so we're not forced to handle every scenario. 
//		
//		
//		try {
//			
//			dangerousMethod("yellow");
//			
////			throw new Exception();
////			callingBrokenMethod(); //If my code breaks, and throws anything, it'll be caught by the catch block. 
//			
//		}catch(IndexOutOfBoundsException e) {
//			
////			System.out.println("Index Exception was thrown!!");
////			
////			e.printStackTrace();
////			
////			System.out.println("Please use a smaller index!");
////			superSafeMethod();
//			
//		} catch(Exception e) {
////			
////			System.out.println("An exception was thrown, not entirely sure which one!");
////			
////			e.printStackTrace();
//		}
//		
//		
//		
//		
//	}
//
}
