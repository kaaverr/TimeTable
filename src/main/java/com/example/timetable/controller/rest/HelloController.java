package com.example.timetable.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

@RequestMapping("/hello")

String sayHello(){
    return  " <h1 style = \"color: aqua\">hello </h1>" +
            " <h1 style = \"color: black\">hello </h1>" +
            " <h1 style = \"color: blue\">hello </h1>";
}

}
