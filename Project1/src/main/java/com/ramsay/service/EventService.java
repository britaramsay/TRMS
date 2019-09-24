package com.ramsay.service;


import java.util.List;

import com.ramsay.dao.EventDAOImpl;
import com.ramsay.model.Event;

public class EventService {

	public static EventDAOImpl eventd = new EventDAOImpl();
	
	public static boolean addEvent(int e_id, Event e) {
		return eventd.addEvent(e_id, e);
	}
	
	public static List<Event> getReimbursements(int e_id) {
		return eventd.getReimbursements(e_id);
	}
	
	public static Event getEvent(int event_id) {
		return eventd.getEvent(event_id);
	}
}
