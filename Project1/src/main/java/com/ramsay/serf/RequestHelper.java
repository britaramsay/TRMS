package com.ramsay.serf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ramsay.webservice.EmployeeWebService;
import com.ramsay.webservice.EventWebService;

public class RequestHelper {

	public static void process(HttpServletRequest request, HttpServletResponse response) {
		
		String uri = request.getRequestURI();
		
		switch(uri) {
			case "/Project1/login.do": {
				EmployeeWebService.getEmployee(request, response);
				break;
			}	
			case "/Project1/makeRequest.do": {
				EventWebService.putEvent(request, response);
				break;
			}
			case "/Project1/getRequestsToReview.do": {
				EventWebService.getRequests(request, response);
			}
		}
	}
}
