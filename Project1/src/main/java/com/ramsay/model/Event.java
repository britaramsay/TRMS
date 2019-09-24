package com.ramsay.model;

import java.sql.Timestamp;

public class Event {
	
	private int event_id;
	private Timestamp startDateTime;
	private String location;
	private String description;
	private float cost;
	private String grade;
	private String type;
	private int reimbursement;
	private String gradingFormat;
	private String passingCuttoff;
	
	public Event(Timestamp startDateTime, String location, String description, float cost, String type, int reimbursement,
			String gradingFormat, String passingCuttoff) {
		super();
		this.startDateTime = startDateTime;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.type = type;
		this.reimbursement = reimbursement;
		this.gradingFormat = gradingFormat;
		this.passingCuttoff = passingCuttoff;
	}

	public Event(int event_id, Timestamp startDateTime, String location, String description, float cost, String grade,
			String type, int reimbursement, String gradingFormat, String passingCuttoff) {
		super();
		this.event_id = event_id;
		this.startDateTime = startDateTime;
		this.location = location;
		this.description = description;
		this.cost = cost;
		this.grade = grade;
		this.type = type;
		this.reimbursement = reimbursement;
		this.gradingFormat = gradingFormat;
		this.passingCuttoff = passingCuttoff;
	}

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public Timestamp getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Timestamp startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getReimbursement() {
		return reimbursement;
	}

	public void setReimbursement(int reimbursement) {
		this.reimbursement = reimbursement;
	}

	public String getGradingFormat() {
		return gradingFormat;
	}

	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}

	public String getPassingCuttoff() {
		return passingCuttoff;
	}

	public void setPassingCuttoff(String passingCuttoff) {
		this.passingCuttoff = passingCuttoff;
	}

	@Override
	public String toString() {
		return "Event [event_id=" + event_id + ", startDateTime=" + startDateTime + ", location=" + location
				+ ", description=" + description + ", cost=" + cost + ", grade=" + grade + ", type=" + type
				+ ", reimbursement=" + reimbursement + ", gradingFormat=" + gradingFormat + ", passingCuttoff="
				+ passingCuttoff + "]";
	}
	
}
