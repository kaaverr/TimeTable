package com.example.timetable.controller.rest;

import com.example.timetable.model.Classroom;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class ClassroomController {

    private List<Classroom> classrooms = new ArrayList<>(
            Arrays.asList(
                    new Classroom("422" , "physical" , 1 ) ,
                    new Classroom("421" , "mathematical" , 6 ) ,
                    new Classroom("342" , "chemistry" , 7 ) ,
                    new Classroom("452" , "gym" , 2 ) ,
                    new Classroom("762" , "foreign" , 4 )

            )
    );

    @RequestMapping("/class")
    List<Classroom> getAll(){

        return classrooms;
    }

}
