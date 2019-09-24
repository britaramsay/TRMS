package com.ramsay.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ramsay.model.Employee;
import com.ramsay.util.JDBCConnection;

public class EmployeeDAOImpl implements EmployeeDAO {

	public static Connection conn = JDBCConnection.getConnection();

	@Override
	public Employee login(String username, String password) {
		try {
			String sql = "SELECT * FROM employees WHERE username = ? AND password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Employee(
						rs.getInt("E_ID"),
						rs.getInt("SUPERVISOR_ID"),
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getString("USERNAME"));
			}
			
		} catch(SQLException e) {
			System.out.println("Invalid username or password. Try again.\n");		
		}
		
		return null;	
	}
	
	@Override
	public Employee getEmployee(int e_id) {
		try {
			String sql = "SELECT * FROM employees WHERE e_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, Integer.toString(e_id));

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Employee(
						rs.getInt("E_ID"),
						rs.getInt("SUPERVISOR_ID"),
						rs.getString("FIRSTNAME"),
						rs.getString("LASTNAME"),
						rs.getString("USERNAME"));
			}
			
		} catch(SQLException e) {
			System.out.println("Invalid username or password. Try again.\n");		
		}
		
		return null;	
	}

}
