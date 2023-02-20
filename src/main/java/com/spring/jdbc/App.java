package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // spring jdbc template
        //forXML config 
//        ApplicationContext context=
//        		new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        //for annotation config
        ApplicationContext context=
        		new AnnotationConfigApplicationContext(jdbcconfig.class);
       
        StudentDao temp= context.getBean("std", StudentDao.class);
        //insert query 
//        Student s=new Student();
//        s.setId(5146);
//        s.setName("ramter");
//        s.setCity("mumbai1");
//        int res = temp.insert(s);
//        System.out.println("st added  .........."+res);
        
//        //update query
//        Student s=new Student();
//        s.setId(5146);
//        s.setName("samt");
//        s.setCity("zimbabe");
//        int res = temp.change(s);
//        System.out.println("st update is  .........."+res);
        
//        //delete operation
//        Student del=new Student();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter The Student ID:");
//        int r1 = input.nextInt();
//        del.setId(r1);
//        int res = temp.delete(del);
//        System.out.println("st delete is  .........."+res);
        
        
//        //insert 
//        String query="insert into student (id,name,city) values(?,?,?)";
//        
//        //fire query
//        int res = temp.update(query,456,"subesh ch", "kanpur");
//        System.out.println("no of records affected  "+ res);
        
//        //select single data
//        Student student = temp.getStudent(456);
//        System.out.println(student);
        	//select multiple data
          List<Student> allStudents = temp.getAllStudents();
          for(Student s1:allStudents) {
        	  System.out.println(s1);
          }
    }
}
