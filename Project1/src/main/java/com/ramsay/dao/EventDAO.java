package com.ramsay.dao;

import java.util.List;

import com.ramsay.model.Event;

public interface EventDAO {
	// event and request/ move?
	public boolean addEvent(int e_id, Event e);
	public List<Event> getReimbursements(int e_id);
	public Event getEvent(int event_id);
}
