package com.example.Studentexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Studentexample.model.Student;
import com.example.Studentexample.repository.StudentRepo;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student addStudent(Student student) {
//		Student addedStudent = studentRepo.save(student);
//		return addedStudent;
		return studentRepo.save(student);
	
	}
	public List<Student> getAllStudents() {
		return(List<Student>) studentRepo.findAll();
	}
	public String deleteStudent(int id) {
		studentRepo.deleteById(id);
		return "deleted successfully";
	}
	
	public String deleteAllStudents() {
		studentRepo.deleteAll();
		return "Deleted successfully";
	}
	public Optional<Student> getStudent(int id) {
//		Student student = studentRepo.findById(id);
//		return student;
		return studentRepo.findById(id);
	}
	@Override
	public Student save(Student student) {
		return studentRepo.save(student);
		
	}
	
	
	
	

}
