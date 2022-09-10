package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext con= new AnnotationConfigApplicationContext(JavaConfig.class);
          Student student = con.getBean("firstStudent",Student.class);
          System.out.println(student);
          student.study();
	}

}
