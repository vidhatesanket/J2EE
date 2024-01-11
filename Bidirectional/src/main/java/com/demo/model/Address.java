package com.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BiAddr")
public class Address {
	@Id
	private int addid;
	private String city;
	private String street;
	@OneToOne(mappedBy="addid")
	private MyUser user;
	public Address(int addid, String city, String street, MyUser user) {
		super();
		this.addid = addid;
		this.city = city;
		this.street = street;
		this.user = user;
	}
	public Address(int addid, String city, String street) {
		super();
		this.addid = addid;
		this.city = city;
		this.street = street;
	}
	public Address() {
		super();
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public MyUser getUser() {
		return user;
	}
	public void setUser(MyUser user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", street=" + street + ", user=" + user + "]";
	}
	
	
}
