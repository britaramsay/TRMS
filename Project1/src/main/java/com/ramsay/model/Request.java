package com.ramsay.model;

public class Request {
	int r_id;
	int event_id;
	int reqEmployee;
	int sendTo;
	int approved;
	String reason;
	int requestInfo;
	String additionalInfo;
	
	public Request(int r_id, int event_id, int reqEmployee, int sendTo) {
		super();
		this.r_id = r_id;
		this.event_id = event_id;
		this.reqEmployee = reqEmployee;
		this.sendTo = sendTo;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public int getReqEmployee() {
		return reqEmployee;
	}

	public void setReqEmployee(int reqEmployee) {
		this.reqEmployee = reqEmployee;
	}

	public int getSendTo() {
		return sendTo;
	}

	public void setSendTo(int sendTo) {
		this.sendTo = sendTo;
	}

	public int getApproved() {
		return approved;
	}

	public void setApproved(int approved) {
		this.approved = approved;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getRequestInfo() {
		return requestInfo;
	}

	public void setRequestInfo(int requestInfo) {
		this.requestInfo = requestInfo;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	
	
}
