package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.model.Student;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext a= new AnnotationConfigApplicationContext(config.class);
		Student S1= (Student)a.getBean(Student.class);
		System.out.println(S1);
	}

}
