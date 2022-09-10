package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {

	@Value("1")
	private int id;
	@Value("Anas ali")
	private String name;
	@Autowired
	private Samosa samosa;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  void study() {
		this.samosa.getObject();
		System.out.println("I am studyting very well");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
