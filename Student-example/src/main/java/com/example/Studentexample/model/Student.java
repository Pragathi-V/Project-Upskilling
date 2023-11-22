package com.example.Studentexample.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "students")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	
	private String name;
	private int age;
	private double salary; 

}
