package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

//created interface to maintain loose coupling
public interface StudentDao {
    public int insert(Student student);
    public int change(Student student);
}
