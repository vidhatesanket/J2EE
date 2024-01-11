package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Departments")
public class Department {
	
	private int deptid;
	private String dname;
	
	
	private Employee emp;


	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Department(int deptid, String dname, Employee emp) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.emp = emp;
	}


	public int getDeptid() {
		return deptid;
	}


	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", emp=" + emp + "]";
	}
	

}
