package com.example.timetable.controller.rest;

import com.example.timetable.model.Student;
import com.example.timetable.servise.group.GroupServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    GroupServise service;

    private List<Student> students;


    @PostConstruct
    void init(){
        students = new ArrayList<>(
                Arrays.asList(
                        new Student("5" , "ola" , service.getGroupById("5")),
                        new Student("2" , "mak" , service.getGroupById("2")),
                        new Student("8" , "geo" , service.getGroupById("3")),
                        new Student("4" , "som" , service.getGroupById("1"))
                )
        );
    }

    @RequestMapping("/group")
    List<Student> getAll(){
        return students;
    }
}