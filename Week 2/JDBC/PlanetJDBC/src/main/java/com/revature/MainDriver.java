package com.revature;

import com.revature.singelton.Sun;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConnectionFactory.getConnection();
//		
//		PlanetDao pDao = new PlanetDaoImpl();
//		pDao.insertPlanet(new Planet(100,"Mars","red",false,2));
//		System.out.println(pDao.selectAllPlanets());
		
//		Sun sun = new Sun();
		Sun sun = Sun.createSun();
		sun.nuclearFusion();
		
		sun.nuclearFusion();
		sun.nuclearFusion();
		sun.nuclearFusion();
		sun.nuclearFusion();
		sun.nuclearFusion();
		
		Sun anotherSun = Sun.createSun();
		anotherSun.nuclearFusion();
		
	}

}
