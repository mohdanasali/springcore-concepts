package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[]args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
       Person p=  (Person)con.getBean("person1");
       System.out.println(p);
       System.out.println(p.getFriends().getClass().getName());
       System.out.println(p.getFeestructure());

}
}
