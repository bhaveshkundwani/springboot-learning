package com.springjdbc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.model.Student;

@Repository
public class StudentRepository {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Student student) {
		
		String sql = "INSERT INTO student (rollNo, name, marks) VALUES (?, ?, ?)";
		
		int rows = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getMarks());
		System.out.println("Rows Affected " + rows);
		
	}

	public List<Student> findAll() {
		List<Student> students = new ArrayList<>();
		return students;
	}

}
