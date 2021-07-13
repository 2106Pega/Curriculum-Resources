package com.revature.service;

public interface AuthService {
	
	public boolean authenticateUser(String username, String password);
	
	public String createToken(String username);
	
	public boolean validateToken(String token);

}
