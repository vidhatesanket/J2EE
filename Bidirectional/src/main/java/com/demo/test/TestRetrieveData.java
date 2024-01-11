package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestRetrieveData {

	public static void main(String[] args) {
		SessionFactory sf1=new Configuration().configure().buildSessionFactory();
		Session sess1=sf1.openSession();
		Transaction tr1=sess1.beginTransaction();
		Address temp=sess1.get(Address.class,1);
		System.out.println(temp);
		tr1.commit();
		sess1.close();
		sf1.close();
	

	}

}
