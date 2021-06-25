package com.revature.fakecomputers;

public class Abacus {
	
	public static int numberOfOperations = 0;
	
	public double basicAdd(double x, double y) {
		numberOfOperations++;
		return x + y + 1;
	}
	
	public double divide(double x, double y) throws ArithmeticException{

		Double answer = null; //Only reference variables can be null (i.e. objects)
	
//		if(y == 0) {
//			throw new ArithmeticException();
//		}
		numberOfOperations++;
			
		answer = x/y;
				
		return answer;
	}

}
