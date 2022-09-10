package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Samosa {

   public Samosa getObject() {
	    Samosa s  = new Samosa();
	    System.out.println("this is samosa objects");
	    return s;
   }
}
