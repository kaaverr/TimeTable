package com.example.timetable.controller.ui;

import com.example.timetable.model.Classroom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller

public class ClassroomWebUIController {

    private List<Classroom> classrooms = new ArrayList<>(
            Arrays.asList(
                    new Classroom("422" , "physical" , 1 ) ,
                    new Classroom("421" , "mathematical" , 6 ) ,
                    new Classroom("342" , "chemistry" , 7 ) ,
                    new Classroom("452" , "gym" , 2 ) ,
                    new Classroom("762" , "foreign" , 4 )

            )
    );

    @RequestMapping("/ui/rooms")
    String getAll(Model model){
        System.out.println("hello");
        return "classrooms";
    }

}
