package com.demo.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.NonPerishable;
import com.demo.model.Perishable;
import com.demo.model.product;

public class TestTablePerClass {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session1=sf.openSession();
		Transaction tr=session1.beginTransaction();
		Perishable p1=new Perishable(2,"Biscuits",new Date(),new Date());
		NonPerishable p2=new NonPerishable(3,"Chair",new Date(),"Furniture");
		session1.save(p1);
		session1.save(p2);
//		product p=session1.get(product.class, 2);
//		System.out.println("Information" +p);
		tr.commit();
		session1.close();
		
	}

}
