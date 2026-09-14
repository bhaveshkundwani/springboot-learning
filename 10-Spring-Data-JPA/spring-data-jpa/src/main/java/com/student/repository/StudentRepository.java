package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
//	@Query("SELECT s FROM Student s WHERE s.name = ?1")
  	List<Student> findByName(String name);
	
	List<Student> findByMarks(int marks);
	
	List<Student> findByMarksGreaterThan(int marks);
}
