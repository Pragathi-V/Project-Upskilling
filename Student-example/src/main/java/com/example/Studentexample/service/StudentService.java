package com.example.Studentexample.service;

import java.util.List;
import java.util.Optional;

import com.example.Studentexample.model.Student;

public interface StudentService {
	
	

	  Student addStudent(Student student);
	 
	  List<Student> getAllStudents();
	  
	  String deleteStudent(int id);
	  
	  Optional<Student> getStudent(int id);

	  String deleteAllStudents();

	  Student save(Student student);

	

}
