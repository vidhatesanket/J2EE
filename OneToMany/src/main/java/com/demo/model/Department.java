package com.demo.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Departments")
public class Department {
	@Id
	private int dept;
	private String dname;
	private String dloc;
	@OneToMany(mappedBy="deptno",cascade=CascadeType.ALL)
	private List<Employee> elist;
	
	public Department() {
		super();
	}
	
	public Department(int dept, String dname, String dloc, List<Employee> elist) {
		super();
		this.dept = dept;
		this.dname = dname;
		this.dloc = dloc;
		this.elist = elist;
	}
	public Department(int dept, String dname, String dloc) {
		super();
		this.dept = dept;
		this.dname = dname;
		this.dloc = dloc;
		
	}
	public int getDept() {
		return dept;
	}
	public void setDept(int dept) {
		this.dept = dept;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public List<Employee> getElist() {
		return elist;
	}
	public void setElist(List<Employee> elist) {
		this.elist = elist;
	}
	@Override
	public String toString() {
		return "Department [dept=" + dept + ", dname=" + dname + ", dloc=" + dloc +"]";
	}
	
	
}
