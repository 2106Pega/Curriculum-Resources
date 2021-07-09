package com.revature.dao;

import com.revature.exceptions.UserNotExistsException;
import com.revature.models.User;

public interface UserDao {

	User selectUserByName(String user) throws UserNotExistsException;

}
