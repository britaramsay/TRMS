package com.ramsay.webservice;

import java.io.IOException;

//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramsay.model.Employee;
import com.ramsay.service.EmployeeService;

public class EmployeeWebService {

	public static void getEmployee(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Employee employee = EmployeeService.getEmployee(username, password);
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			System.out.println(employee);
			
			HttpSession sess = request.getSession();
			sess.setAttribute("e_id", employee.getE_id());

			System.out.println(sess.getAttribute("e_id"));

//			Cookie c = new Cookie("e_id", employee.getE_id());
			String employeeJSON = om.writeValueAsString(employee);
			response.getWriter().append(employeeJSON);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
