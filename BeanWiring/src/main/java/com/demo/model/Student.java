package com.demo.model;

import java.util.List;

public class Student {
	private int sid;
	private String stname;
	private List<String> hobbies;
	private List<Skills> slist;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String stname, List<String> hobbies, List<Skills> slist) {
		super();
		this.sid = sid;
		this.stname = stname;
		this.hobbies = hobbies;
		this.slist = slist;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public List<Skills> getSlist() {
		return slist;
	}
	public void setSlist(List<Skills> slist) {
		this.slist = slist;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", stname=" + stname + ", hobbies=" + hobbies + ", slist=" + slist + "]";
	}
	
	
}
