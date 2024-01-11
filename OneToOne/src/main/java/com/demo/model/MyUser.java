package com.demo.model;

import javax.persistence.*;
import com.demo.model.*;
@Entity
@Table(name="User11")
public class MyUser {
	@Id
	private int uid;
	private String name;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AddrId")
	private Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String name, Address addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", name=" + name + ", addr=" + addr + "]";
	}
	
}
