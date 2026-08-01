package com.springjdbc;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springjdbc.model.Student;
import com.springjdbc.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		Student student = context.getBean(Student.class);
		student.setRollNo(1);
		student.setName("Bhavesh");
		student.setMarks(90);
		
		StudentService service = context.getBean(StudentService.class);
		
		service.addStudent(student);
		
		List<Student> students = service.getStudents();
		System.out.println(students);
		
	}

}
