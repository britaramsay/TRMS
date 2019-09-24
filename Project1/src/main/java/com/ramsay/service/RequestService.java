package com.ramsay.service;

import java.util.List;
import com.ramsay.dao.RequestDAOImpl;
import com.ramsay.model.Request;

public class RequestService {

	public static RequestDAOImpl requestd = new RequestDAOImpl();

	public static List<Request> getRequests(int e_id) {
		System.out.println(e_id);
		return requestd.getRequests(e_id);
	}
	
	public boolean approveRequest(int r_id, int e_id) {
		return requestd.approveRequest(r_id, e_id);
	}
}