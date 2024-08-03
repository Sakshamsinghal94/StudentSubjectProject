package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Entity
@Table(name="subject")
public class Subject {
    @Id
    private int id;
    private  String name;

    public List<Integer> getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(List<Integer> subjectid) {
        this.subjectid = subjectid;
    }

    private   List<Integer> subjectid;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}