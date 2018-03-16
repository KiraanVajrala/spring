package com.bellinfo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bellinfo.spring.model.Student;

public interface StudentService {
	
	void processStudentData(Student student);

}
