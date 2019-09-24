package com.ramsay.dao;

import com.ramsay.model.Employee;

public interface EmployeeDAO {
	
	public Employee login(String username, String password);
	public Employee getEmployee(int e_id);

}