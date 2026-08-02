package com.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjdbc.model.Student;
import com.springjdbc.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
}
