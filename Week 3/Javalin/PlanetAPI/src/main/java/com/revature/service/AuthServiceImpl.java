package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.exceptions.UserNotExistsException;
import com.revature.models.User;

public class AuthServiceImpl implements AuthService {
	
	UserDao uDao = new UserDaoImpl();

	@Override
	public boolean authenticateUser(String username, String password) {

		try {
			User u = uDao.selectUserByName(username);
			
			//checking if user exists with that username
			if(u == null) {
				return false;
			}else {
				
				//chekcing if that user password matches. 
				if(password.equals(u.getPassword())) {
					return true;
				}
			}
			
			
		} catch (UserNotExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	
	}

}
