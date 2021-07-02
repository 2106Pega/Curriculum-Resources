package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	
	/*
	 * JDBC - Java Database Connection 
	 * 
	 * JDBC API handles databases using Java, allows us to interact with out 
	 * 	db through CRUD methods. 
	 * 
	 * DriverManager
	 * Connection 
	 * Statement
	 * PreparedStatment
	 * CallableStatement
	 */
	
	/*
	 * What do we need to connect? 
	 * 
	 * Endpoint
	 * username 
	 * password
	 * 
	 */
	
//	private static final String URL = "jdbc:postgresql://[ENDPOINT]/[DATABASE]";
	private static final String URL = "jdbc:postgresql://localhost/postgres";
	private static final String USERNAME = "java_user";
	private static final String PASSWORD = "p4ssw0rd";
	
	private static Connection conn;
	
	public static Connection getConnection() {
		
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
