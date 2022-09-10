package com.springcore.collection;

import java.util.*;
public class emp {

	private String name;
	private List<String> phones;
	private Set<String> addres;
	private Map<String ,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddres() {
		return addres;
	}
	public void setAddres(Set<String> addres) {
		this.addres = addres;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public emp(String name, List<String> phones, Set<String> addres, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.addres = addres;
		this.courses = courses;
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}


}
