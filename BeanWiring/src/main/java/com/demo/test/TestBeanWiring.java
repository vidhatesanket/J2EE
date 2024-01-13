package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Person;
import com.demo.model.Skills;
import com.demo.model.Student;

public class TestBeanWiring {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Person temp=(Person) ctx.getBean("p1");
		System.out.println(temp);
		Skills s1=(Skills) ctx.getBean("sk1");
		System.out.println(s1);
		Skills s2=(Skills) ctx.getBean("sk2");
		System.out.println(s2);
		Skills s3=(Skills) ctx.getBean("sk3");
		System.out.println(s3);
		
		
		Student student1=(Student) ctx.getBean("st1");
		System.out.println("Student's data: "+student1);

	}

}
