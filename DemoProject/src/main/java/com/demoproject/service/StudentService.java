package com.demoproject.service;

import java.util.List;

import com.demoproject.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
	void deleteStudent(long id);
}
