package com.demo.model;

public class Person {
	private int pid;
	private String pname;
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
