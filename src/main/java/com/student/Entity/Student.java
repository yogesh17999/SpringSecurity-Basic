package com.student.Entity;




public class Student {
	
	long id;
	String sname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(long id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	
	
	

}
