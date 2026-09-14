package com.student;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args); 
		
		StudentRepository repo = context.getBean(StudentRepository.class);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//		s2.setRollNo(102);
//		s2.setName("Kiran");
//		s2.setMarks(80);
//
		s3.setRollNo(103);
		s3.setName("Bhavesh");
		s3.setMarks(90);
//		
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);
		
//		System.out.println(repo.findAll());
//		
//		Optional<Student> s = repo.findById(105);
//		System.out.println(s.orElse(new Student()));
//		System.out.println(repo.findById(101));
		 
//		System.out.println(repo.findByName("Navin"));
//		System.out.println(repo.findByMarks(75));
//		
//		System.out.println(repo.findByMarksGreaterThan(72));
		
		// update
		repo.save(s3);

		// delete
		repo.delete(s3);
	}

}
