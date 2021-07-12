package com.revature.service;

import java.util.List;

import com.revature.dao.PlanetDao;
import com.revature.dao.PlanetDaoImpl;
import com.revature.models.Planet;

public class PlanetServiceImpl implements PlanetService {

	PlanetDao pDao = new PlanetDaoImpl();
	
	@Override
	public List<Planet> getAllPlanets() {
		
		List<Planet> planetList = pDao.selectAllPlanets();
		
		// TODO Auto-generated method stub
		return planetList;
	}

	@Override
	public boolean createPlanet(Planet newPlanet) {
		
		return pDao.insertPlanet(newPlanet);
		
	}

	@Override
	public boolean deletePlanet(Planet p) {


		return pDao.deletePlanet(p);
	}

	@Override
	public boolean updatePlanet(Planet p) {
		// TODO Auto-generated method stub
		return pDao.updatePlanet(p);
	}

	@Override
	public Planet getPlanetByName(String name) {

		return pDao.selectPlanetByName(name);
	}

	@Override
	public boolean updatePlanet(Planet p, boolean rings) {
		// TODO Auto-generated method stub
			
		p.setRings(rings);
		return pDao.updatePlanet(p);
		
	}

}
