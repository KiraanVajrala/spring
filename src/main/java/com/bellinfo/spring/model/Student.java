package com.bellinfo.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	
	String name;
	String gender;
	String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	

}
