package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

import java.util.List;

//created interface to maintain loose coupling
public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
    public int delete(int studentId);
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();
}
