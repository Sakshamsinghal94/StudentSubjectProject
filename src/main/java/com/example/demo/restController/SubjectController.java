package com.example.demo.restController;

import com.example.demo.entity.Student;
import com.example.demo.entity.Subject;
import com.example.demo.service.SubjectService;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.service.impl.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SubjectController {

    @Autowired
    private SubjectService subjectservice;


    @PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject){
        return subjectservice.save(subject);

    }
    @GetMapping("/subject")
    public List<Subject> findallsub(){
        return subjectservice.findall();
    }

}
