package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.respositary.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
  @Autowired
    private StudentRepository studentrepository;
    @Override
    public Student save(Student student) {

      return studentrepository.save(student);
    }

  @Override
  public List<Student> findall() {
    return studentrepository.findAll();
  }


}

