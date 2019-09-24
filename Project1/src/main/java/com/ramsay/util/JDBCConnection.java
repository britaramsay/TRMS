package com.ramsay.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	public static Connection conn = null;

	public static void main(String[] args) {
		
		System.out.println(getConnection());
		
	}
	
	public static Connection getConnection() {
		
		try {
			
			if(conn == null) {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String endpoint = System.getenv("AWS_DB_URL");
				String username = System.getenv("AWS_DB_USERNAME");
				String password = System.getenv("AWS_DB_PASSWORD");
				
				conn = DriverManager.getConnection(endpoint, username, password);
				
				return conn;
				
			}
			else {
				return conn;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
