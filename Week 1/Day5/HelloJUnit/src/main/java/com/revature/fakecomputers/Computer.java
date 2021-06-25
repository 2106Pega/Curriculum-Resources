package com.revature.fakecomputers;

public class Computer {
	
	public Abacus abacus;
	
	public Abacus getAbacus() {
		return abacus;
	}

	public void setAbacus(Abacus abacus) {
		this.abacus = abacus;
	}

	public Computer(Abacus abacus) {
		this.abacus = abacus;
	}
	
	public double fancyAdd(double x, double y, double z) {
		
		double answer = abacus.basicAdd(x, y);
		
		answer = abacus.basicAdd(answer,z);
		
		return answer;
		
	}

}
