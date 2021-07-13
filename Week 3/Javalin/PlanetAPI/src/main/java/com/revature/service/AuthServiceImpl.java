package com.revature.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class AuthServiceImpl implements AuthService {
	
	private static byte[] salt = new SecureRandom().getSeed(16);
	
	private UserDao uDao = new UserDaoImpl();
	
	private Map<String, String> tokenRepo = new HashMap<>();

	@Override
	public boolean authenticateUser(String username, String password) {

		if("admin".equals(username) && "1234".equals(password)) {
			return true;
		}
		
		return false;
	
	}


	@Override
	public String createToken(String username) {

		String token = simpleHash(username);
		tokenRepo.put(token, username);
		
		return token;
	}
	


	@Override
	public boolean validateToken(String token) {

		return tokenRepo.containsKey(token);
	}
	
	
	private String simpleHash(String username) {
		String hash = null;
		
		MessageDigest md;
		
		try {
			md = MessageDigest.getInstance("SHA-512");
			
			md.update(salt);
			
			byte[] bytes = md.digest(username.getBytes());
			
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < bytes.length; i++) {
				sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(0));
			}
			
			hash = sb.toString();
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return hash;
	}
	
	

}
