package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestMyUserAddress {
	public static void main(String[] args) {
		Address a1=new Address(1,"Nashik","MG Road");
		Address a2=new Address(2,"Mirajgaon","Nagar Road");
		MyUser u1=new MyUser(17,"Somesh",a1);
		MyUser u2=new MyUser(18,"Sanket",a2);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		sess.save(a1);
		sess.save(a2);
		sess.save(u1);
		sess.save(u2);
		tr.commit();
		sess.close();
		
		/* write in new file  
		1) To get data of particular ID  use update method in hibernate.cfg.xml 
		2) Data must be present in the table.....comment above code
		
		SessionFactory sf1=new Configuration().configure().buildSessionFactory();
		Session sess1=sf1.openSession();
		Transaction tr1=sess1.beginTransaction();
		Address temp=sess1.get(Address.class,1);
		System.out.println(temp);
		tr1.commit();
		sess1.close();
		sf.close();
 
		 */
	}
	
}
