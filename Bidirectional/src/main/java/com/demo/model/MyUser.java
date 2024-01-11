package com.demo.model;

import javax.persistence.*;
import com.demo.model.*;
@Entity
@Table(name="BiUser")
public class MyUser {
	@Id
	private int uid;
	private String name;
	@JoinColumn(name="AddrId")
	@OneToOne //(fetch=FetchType.LAZY)
	private Address addid;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String name, Address addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.addid = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Address getAddid() {
		return addid;
	}
	public void setAddid(Address addid) {
		this.addid = addid;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", name=" + name + "]";
	}
	
}
