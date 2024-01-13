package com.demo.model;
import java.util.Date;

import javax.persistence.*;

@Entity(name="PerishableTablePerClass")
@DiscriminatorValue("Perishable")
public class Perishable extends product {
	private Date expiryDate;

	public Perishable() {
		super();
	}
	public Perishable(int pid, String pname, Date mfgdate,Date exp) {
		super(pid,pname,mfgdate);
		this.expiryDate=exp;
	}
	public Perishable(Date expiryDate) {
		super();
		this.expiryDate = expiryDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return super.toString()+ "Perishable [expiryDate=" + expiryDate + "]";
	}
	
	
	
}
