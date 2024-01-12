package com.demo.model;

import javax.persistence.*;

@Entity
@Table(name="EmpDept")
public class Employee {
	@Id
	private int id;
	private String name;
	private double sal;
	@OneToOne
	private Department deptno;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		
	}
	public Employee(int id, String name, double sal, Department deptno) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.deptno = deptno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Department getDeptno() {
		return deptno;
	}
	public void setDeptno(Department deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
}
