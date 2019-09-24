package com.ramsay.dao;

import java.util.List;

import com.ramsay.model.Request;

public interface RequestDAO {

	public List<Request> getRequests(int e_id);
	public boolean approveRequest(int r_id, int e_id);
}
