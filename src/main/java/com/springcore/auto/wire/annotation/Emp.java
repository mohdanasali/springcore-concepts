package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
   @Autowired
   private Address addres;

public Address getAddres() {
	return addres;
}

public void setAddres(Address addres) {
	this.addres = addres;
}      
public Emp(Address addres) {
	super();
	this.addres = addres;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [addres=" + addres + "]";
}

}
