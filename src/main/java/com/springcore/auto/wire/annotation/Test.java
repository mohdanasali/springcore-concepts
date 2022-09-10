package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[]args) {
	 ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoannotationconfig.xml");
	 Emp emp =(Emp)context.getBean("emp1");
	 System.out.println(emp);
	 System.out.println(emp.hashCode());
	 Emp emp1 =(Emp)context.getBean("emp1");
	 System.out.println(emp1.hashCode());
}
}
