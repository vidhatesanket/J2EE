package com.demo.test;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class RetriveData {

	public static void main(String[] args) {
		
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		
		List<Employee> elist= sess.get(Department.class, 3).getElist();
		System.out.println(elist);
		tr.commit();
		sess.close();
		
		

	}

}
