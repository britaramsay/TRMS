package com.ramsay.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ramsay.model.Request;
import com.ramsay.util.JDBCConnection;

public class RequestDAOImpl implements RequestDAO {

	public static Connection conn = JDBCConnection.getConnection();

	@Override
	public List<Request> getRequests(int e_id) {
		try {
			String sql = "SELECT * FROM requests WHERE sendTo = ? AND approved IS null";
			List<Request> requests = new ArrayList<Request>();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(e_id));

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				requests.add(new Request(
					rs.getInt("R_ID"),
					rs.getInt("EVENT_ID"),
					rs.getInt("REQEMPLOYEE"),
					rs.getInt("SENDTO")));
			}
		
			return requests;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean approveRequest(int r_id, int e_id) {
	String sql = "CALL approve_request(?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setInt(1, r_id);
			cs.setInt(2, e_id);
	
			cs.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;		
	}

	
}
