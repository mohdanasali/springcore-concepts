package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[]args) {
	AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
     Samosa s= (Samosa)context.getBean("samosa");
     System.out.println(s);
     
     context.registerShutdownHook();
     System.out.println("+++++++++++++++++++++++++++++");
     Pepsi p1= (Pepsi)context.getBean("pepsi");
     System.out.println(p1);
}
}
