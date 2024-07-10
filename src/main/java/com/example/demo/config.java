package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Student;

@Configuration
public class config {
	@Bean
	public Student getStudent() {
		return new Student(101,"rishab",20.00);
		
	}
}
