package com.revature.singelton;

public class Sun {
	
	private boolean light;
	private static Sun sun = new Sun();
	
	private Sun() {
	
	}
	
	
	public void nuclearFusion() {
		System.out.println(this.light);
		this.light = true;
	}
	
	public static Sun createSun() {
//		if(sun == null) {
//			sun = new Sun();
//		}
		return sun;
	}

}
