package com.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjdbc.model.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Student student = context.getBean(Student.class);
		student.setRollNo(1);
		student.setName("Bhavesh");
		student.setMarks(90);
		
	}

}
