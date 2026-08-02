package com.springjdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	//with lambda expression
	public List<Student> findAll() {
		
		String sql = "SELECT * FROM student"; 
		
		RowMapper<Student> mapper = (rs, rowNum) -> {
			Student s = new Student();
		    s.setRollNo(rs.getInt("rollNo"));
		    s.setName(rs.getString("name"));
		    s.setMarks(rs.getInt("marks"));
		    return s; 
		}; 
		  
		return jdbcTemplate.query(sql, mapper);
	}
	
	  
	//without lambda expression
//	public List<Student> findAll() {
//		
//		String sql = "SELECT * FROM student";
//		
//		RowMapper<Student> mapper = new RowMapper<Student>() {
//			
//			@Override
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				
//				Student student = new Student();
//				student.setRollNo(rs.getInt("rollNo"));
//				student.setName(rs.getString("name"));
//				student.setMarks(rs.getInt("marks"));
//				
//				return student;
//			}
//			
//		};
//		
//		return jdbcTemplate.query(sql, mapper);
//	}
	 

}
