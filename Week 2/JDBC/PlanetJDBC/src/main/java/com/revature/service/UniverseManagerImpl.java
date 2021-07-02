package com.revature.service;

import java.util.List;

import com.revature.dao.PlanetDao;
import com.revature.dao.UserDao;
import com.revature.exceptions.UserNotExistsException;
import com.revature.models.Planet;
import com.revature.models.User;

public class UniverseManagerImpl implements UniverseManager {
	
	UserDao uDao;
	PlanetDao pDao;
	
	

	public UniverseManagerImpl(UserDao uDao, PlanetDao pDao) {
		super();
		this.uDao = uDao;
		this.pDao = pDao;
	}

	@Override
	public boolean authenticate(String user) {

		//check if user is in the database. 
		
		boolean userExists = false;
		
		try {
			User u= uDao.selectUserByName(user);
			userExists = true;
			
		} catch (UserNotExistsException e) {
			
			e.printStackTrace();
		}
		
		
		return userExists;
	}

	@Override
	public List<Planet> getAllPlanets() {
		
		return pDao.selectAllPlanets();
	}

}
