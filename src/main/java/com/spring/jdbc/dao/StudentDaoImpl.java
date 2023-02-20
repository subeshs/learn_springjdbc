package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component("std")
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO insert data
		String query="insert into student (id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student studnet) {
		// TODO update data
		String query="update student set name =?,city =? where id=?";
		int r = this.jdbcTemplate.update(query,studnet.getName(),studnet.getCity(),studnet.getId());
		
		return r;
	}
	
	public int delete(Student student) {
		// TODO delete
		
		String query="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,student.getId());
		return r;
	}
	
	public Student getStudent(int studnetId) {
		// TODO seletct single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper= new rowMapperImpel();
		Student st = this.jdbcTemplate.queryForObject(query, rowMapper,studnetId);
		
		return st;
	}
	public List<Student> getAllStudents() {
		// TODO selecting all studnet or multiple
		String query="select * from student";
		List<Student> r = this.jdbcTemplate.query(query, new rowMapperImpel());
		return r;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	

	



}
