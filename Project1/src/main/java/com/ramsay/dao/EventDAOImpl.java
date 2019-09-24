package com.ramsay.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ramsay.model.Event;
import com.ramsay.util.JDBCConnection;

public class EventDAOImpl implements EventDAO {

	public static Connection conn = JDBCConnection.getConnection();

	// event adn request? move?
	@Override
	public boolean addEvent(int e_id, Event event) {
		System.out.println(e_id + " eid");
		String sql = "CALL insert_event_request(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			CallableStatement cs = conn.prepareCall(sql);
			
			cs.setInt(1, e_id);
			cs.setTimestamp(2, event.getStartDateTime());
			cs.setString(3, event.getLocation());
			cs.setString(4, event.getDescription());
			cs.setFloat(5,  event.getCost());
			cs.setString(6, event.getType());
			cs.setInt(7, event.getReimbursement());
			cs.setString(8, event.getGradingFormat());
			cs.setString(9, event.getPassingCuttoff());
			
			cs.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public List<Event> getReimbursements(int e_id) {
		try {
			String sql = "SELECT * FROM events WHERE event_id IN (SELECT event_id FROM requests WHERE reqEmployee = ? AND approved = 1)";
			List<Event> reimbursements = new ArrayList<Event>();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(e_id));

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				reimbursements.add(new Event(
					rs.getInt("EVENT_ID"),
					rs.getTimestamp("STARTDATETIME"),
					rs.getString("LOCATION"),
					rs.getString("DESCRIPTION"),
					rs.getFloat("COST"),
					rs.getString("GRADE"),
					rs.getString("TYPE"),
					rs.getInt("REIMBURSEMENT"),
					rs.getString("GRADINGFORMAT"),
					rs.getString("PASSINGCUTTOFF")));
			}
		
			return reimbursements;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public Event getEvent(int event_id) {
		try {
			String sql = "SELECT * FROM events WHERE event_id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Integer.toString(event_id));

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Event(
					rs.getInt("EVENT_ID"),
					rs.getTimestamp("STARTDATETIME"),
					rs.getString("LOCATION"),
					rs.getString("DESCRIPTION"),
					rs.getFloat("COST"),
					rs.getString("GRADE"),
					rs.getString("TYPE"),
					rs.getInt("REIMBURSEMENT"),
					rs.getString("GRADINGFORMAT"),
					rs.getString("PASSINGCUTTOFF"));
			}
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
