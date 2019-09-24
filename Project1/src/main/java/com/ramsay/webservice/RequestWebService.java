package com.ramsay.webservice;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramsay.model.Employee;
import com.ramsay.service.EmployeeService;

public class RequestWebService {
	public static void getEmployee(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession sess = request.getSession();
		int e_id = Integer.parseInt(sess.getAttribute("e_id").toString());
		int r_id = Integer.parseInt(request.getParameter("username"));

		ObjectMapper om = new ObjectMapper();
		
//		try {
//			
//			
//
//			System.out.println(sess.getAttribute("e_id"));
//
////			Cookie c = new Cookie("e_id", employee.getE_id());
//			String employeeJSON = om.writeValueAsString(employee);
//			response.getWriter().append(employeeJSON);
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
	}
}
