package com.demo.beans;

public class User {
	
	String uname;
	String role;
	String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String uname, String role, String password) {
		super();
		this.uname = uname;
		this.role = role;
		this.password = password;
	}
	public User(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", role=" + role + ", password=" + password + "]";
	}
	
}
