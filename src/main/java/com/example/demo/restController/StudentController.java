package com.example.demo.restController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {


    @Autowired
    private StudentService studentservice;


@PostMapping ("/student")
public Student addStudent(@RequestBody Student student){
   return studentservice.save(student);

}
    @GetMapping("/student")
    public List<Student> findallstud(){
    return studentservice.findall();
    }







}
