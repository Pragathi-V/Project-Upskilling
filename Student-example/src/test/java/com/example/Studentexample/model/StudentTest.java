package com.example.Studentexample.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.data.mongodb.core.mapping.Document;

class StudentTest {

	@Test
	void testStudentConstructor() {
		Student s = new Student("Pragathi" ,20, 12345.7);
		
		assertNotNull(s);
		assertEquals("Pragathi", s.getName());
		assertEquals(20, s.getAge());
		assertEquals(12345.7, s.getSalary());
	}
	
	@Test
	void testGettersAndSetters() {
		
		Student s = new Student();
		
		s.setName("Pragathi");
		s.setAge(20);
		s.setSalary(12345.7);
		
		
		assertEquals("Pragathi", s.getName());
		assertEquals(20, s.getAge());
		assertEquals(12345.7, s.getSalary());
	}
	
	@Test
	void testBuilder() {
		Student s = Student.builder()
				.name("Pragathi")
				.age(20)
				.salary(12345.7)
				.build();
		
		assertNotNull(s);
		assertEquals("Pragathi", s.getName());
		assertEquals(20, s.getAge());
		assertEquals(12345.7, s.getSalary());
		

	}
	
	@Test
	void testEqualityandHashCode() {
		Student s1 = new Student("Pragathi" ,20, 12345.7);
		Student s2 = new Student("Pragathi" ,20, 12345.7);
		
		assertEquals(s1, s2);
		assertEquals(s1.hashCode(), s2.hashCode());
		
	}
	
	@Test
	void testToString() {
		Student s = new Student("Pragathi" ,20, 12345.7);
		String expectedToString = "Student(name=Pragathi, age=20, salary=12345.7)";
		
		assertEquals(expectedToString, s.toString());

	}
	
}