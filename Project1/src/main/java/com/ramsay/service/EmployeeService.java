package com.ramsay.service;

import com.ramsay.dao.EmployeeDAOImpl;
import com.ramsay.model.Employee;

public class EmployeeService {
	
	public static EmployeeDAOImpl ed = new EmployeeDAOImpl();

	public static Employee getEmployee(String username, String password) {
		Employee em = ed.login(username, password);
		Employee.setUser_id(em.getE_id());
		return em;
	}

	public static Employee getEmployee(int e_id) {
		Employee em = ed.getEmployee(e_id);
		return em;
	}
}
