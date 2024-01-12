package com.demo.test;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class OneToManyTest {

	public static void main(String[] args) {
		Department d1=new Department(3,"Software Dev.","Pune");
		
		Employee e1=new Employee(1,"Somesh",859321758,d1);
		Employee e2=new Employee(2,"Abhishek",2347223,d1);
		List<Employee> elist=new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e2);
		
		d1.setElist(elist);
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(e1);
		sess.save(e2);
		sess.save(d1);
		//List<Employee> elist= sess.get(Department.class, 3).getElist();
		//System.out.println(elist);
		tr.commit();
		sess.close();
		
		

	}

}
