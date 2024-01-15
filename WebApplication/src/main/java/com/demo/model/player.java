package com.demo.model;

public class player {
	
	private int pid;
	private String name;
	private String skills;
	public player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public player(int pid, String name, String skills) {
		super();
		this.pid = pid;
		this.name = name;
		this.skills = skills;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "player [pid=" + pid + ", name=" + name + ", skills=" + skills + "]";
	}
	
}
