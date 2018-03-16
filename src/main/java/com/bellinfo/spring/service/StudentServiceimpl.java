package com.bellinfo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bellinfo.spring.model.Student;
import com.bellinfo.spring.repo.StudentRepo;

@Component
public class StudentServiceimpl implements StudentService{

	@Autowired
	StudentRepo repo;

	public void processStudentData(Student student) {
		repo.getConnection();
		repo.createStudentStructure();
		repo.insertStudent(student);
	}


}
