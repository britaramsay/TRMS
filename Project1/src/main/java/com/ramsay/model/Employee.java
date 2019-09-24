package com.ramsay.model;

public class Employee {

	private int e_id;
	private int supervisor_id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private static int user_id;
	
	public Employee() {
		super();
	}

	public Employee(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public Employee(int e_id, int supervisor_id, String firstname, String lastname, String username) {
		super();
		this.e_id = e_id;
		this.supervisor_id = supervisor_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
	}

	public Employee(int supervisor_id, String firstname, String lastname, String username, String password) {
		super();
		this.supervisor_id = supervisor_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}

	public Employee(int e_id, int supervisor_id, String firstname, String lastname, String username, String password) {
		super();
		this.e_id = e_id;
		this.supervisor_id = supervisor_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", supervisor_id=" + supervisor_id + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", username=" + username + ", password=" + password + "]";
	}

	public static int getUser_id() {
		return user_id;
	}

	public static void setUser_id(int user_id) {
		Employee.user_id = user_id;
	}

	
	
}
