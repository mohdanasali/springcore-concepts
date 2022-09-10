package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collection/configcollection.xml");
		emp emp1 = (emp)context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddres());
		System.out.println(emp1.getCourses());
		
	}

}
