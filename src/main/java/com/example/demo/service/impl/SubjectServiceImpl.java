package com.example.demo.service.impl;

import com.example.demo.entity.Student;
import com.example.demo.entity.Subject;
import com.example.demo.respositary.StudentRepository;
import com.example.demo.respositary.SubjectRepository;
import com.example.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectRepository subjectrepository;
    @Override
    public Subject save(Subject subject) {

        return subjectrepository.save(subject);
    }

    @Override
    public List<Subject> findall() {
        return subjectrepository.findAll();
}}
