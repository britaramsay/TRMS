package com.ramsay.model;

public class Departments {

	int d_id;
	String name;
	int head_id;
	
	public Departments(int d_id) {
		super();
		this.d_id = d_id;
	}

	public Departments(String name, int head_id) {
		super();
		this.name = name;
		this.head_id = head_id;
	}

	public Departments(int d_id, String name, int head_id) {
		super();
		this.d_id = d_id;
		this.name = name;
		this.head_id = head_id;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHead_id() {
		return head_id;
	}

	public void setHead_id(int head_id) {
		this.head_id = head_id;
	}

	@Override
	public String toString() {
		return "Departments [d_id=" + d_id + ", name=" + name + ", head_id=" + head_id + "]";
	}

}
