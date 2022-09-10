package com.springcore.sterotytpe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/sterotytpe/sterotypeconfig.xml");
Student student = (Student)con.getBean("student");
System.out.println(student);
	}

}
