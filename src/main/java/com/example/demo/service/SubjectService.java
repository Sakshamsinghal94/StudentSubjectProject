package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Subject;

import java.util.List;

public interface SubjectService {

        public Subject save(Subject subject);
        public List<Subject> findall();

    }
