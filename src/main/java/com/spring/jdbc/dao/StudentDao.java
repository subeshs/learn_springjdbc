package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student studnet);
	public int delete(Student student);
	public Student getStudent(int studnetId);
	public List<Student> getAllStudents();
}
