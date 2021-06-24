package com.revature;

public class ColourException extends Exception {
	
	@Override
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("Don't use yellow");
	}

}
