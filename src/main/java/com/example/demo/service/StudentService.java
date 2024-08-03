package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public Student save(Student student);
    public List<Student> findall();

}