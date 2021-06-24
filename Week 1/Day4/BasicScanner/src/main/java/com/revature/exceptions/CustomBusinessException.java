package com.revature.exceptions;

public class CustomBusinessException extends RuntimeException{
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("You messed up my business");
	}

}
