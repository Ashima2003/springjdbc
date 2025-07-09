package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(666, "John", "Lucknow");
        int result = studentDao.insert(student);
        System.out.println("Student added"+ result);

//        Student student = new Student(666, "Satpal", "Assam");
//        int result= studentDao.change(student);
//        int result= studentDao.delete(666);
//        System.out.println("Student added"+ result);

//        Student student = studentDao.getStudent(456);
//        System.out.println(student);

        List<Student> students = studentDao.getAllStudents();
        for(Student s:students){
            System.out.println(s);
        }
    }
}