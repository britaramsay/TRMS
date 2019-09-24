package com.ramsay.webservice;

import java.io.IOException;
import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ramsay.model.Employee;
import com.ramsay.model.Event;
import com.ramsay.model.Request;
import com.ramsay.service.EmployeeService;
import com.ramsay.service.EventService;
import com.ramsay.service.RequestService;

public class EventWebService {

	public static void putEvent(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sess = request.getSession();
		System.out.println(Integer.parseInt(sess.getAttribute("e_id").toString()));
		java.sql.Timestamp startDateTime = Timestamp.valueOf(request.getParameter("startDateTime").replace("T", " ") + ":00");
		System.out.println(startDateTime);
		String location = request.getParameter("location");
		String description = request.getParameter("description");
		float cost = Float.parseFloat(request.getParameter("cost"));
		String type = request.getParameter("type");
		int reimbursement = Integer.parseInt(request.getParameter("reimbursement"));
		String gradingFormat = request.getParameter("gradingFormat");
		String passingCuttoff = request.getParameter("passingCuttoff");
	
		Event e = new Event(startDateTime, location, description,
				cost, type, reimbursement, gradingFormat, passingCuttoff);
		
		EventService.addEvent(Employee.getUser_id(), e);
	}
	
	public static void getRequests(HttpServletRequest request, HttpServletResponse response) {
		HttpSession sess = request.getSession();
		
		List<Request> requests = RequestService.getRequests(Integer.parseInt(sess.getAttribute("e_id").toString()));

		ObjectMapper om = new ObjectMapper();

		String requestJSON = "[";		
		
		try {
			
			for(int i = 0; i < requests.size(); i++) {
				if(i != 0) {
					requestJSON += ",";
				}
				
				int event_id = requests.get(i).getEvent_id();
				String eventJSON = om.writeValueAsString(EventService.getEvent(event_id));

				int reqEmployee = requests.get(i).getReqEmployee();
				String reqEmployeeJSON = om.writeValueAsString(EmployeeService.getEmployee(reqEmployee));
				
				requestJSON += "{\"r_id\":" + requests.get(i).getR_id() + ",\"event_id\":" + eventJSON + ",\"reqEmployee\":" + reqEmployeeJSON + "}";
			}
			
//			Cookie c = new Cookie("e_id", employee.getE_id());

			requestJSON += "]";

			response.getWriter().append(requestJSON);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}















