package com.demo.model;
import java.util.Date;

import javax.persistence.*;

@Entity(name="prodinherit")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class product {
	@Id
	private int pid;
	private String pname;
	private Date mfgdate;
	
	public product() {
		super();
	}
	public product(int pid, String pname, Date mfgdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mfgdate = mfgdate;
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
	public Date getMfgdate() {
		return mfgdate;
	}
	public void setMfgdate(Date mfgdate) {
		this.mfgdate = mfgdate;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", mfgdate=" + mfgdate + "]";
	}
	
}
