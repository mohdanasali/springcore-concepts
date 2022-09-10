package com.springcore.sterotytpe;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
@Value("anas")
private String studentName;
@Value("Muzaffarnagar")
private String city;
@Value("#{temp}")
private List<String> addres; 
public List<String> getAddres() {
	return addres;
}
public void setAddres(List<String> addres) {
	this.addres = addres;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", city=" + city + ", addres=" + addres + "]";
}

}

