package com.demo.model;

import java.util.Date;

import javax.persistence.*;

@Entity(name="NonPerishableTablePerClass")
@DiscriminatorValue("Non-Perishable")
public class NonPerishable extends product{
	private String category;

	public NonPerishable() {
		super();
	}

	public NonPerishable(int pid, String pname, Date mfgdate,String ctg) {
		super(pid,pname,mfgdate);
		this.category=ctg;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return super.toString()+"NonPerishable [category=" + category + "]";
	}
	
}
