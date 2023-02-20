package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class jdbcconfig {
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("zxcv");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
//	@Bean("std")
//	public StudentDao getStudentDao(){
//		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
//		studentDaoImpl.setJdbcTemplate(getTemplate());
//		return studentDaoImpl;
//	}
}
