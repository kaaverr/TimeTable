package com.example.timetable.controller.rest;

import com.example.timetable.model.Checia;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController

public class ChaicaController {
    private List<Checia> checias = new ArrayList<>(
            Arrays.asList(
                    new Checia("422" , " mai " , "mathematics") ,
                    new Checia("429" , " ola " , "english") ,
                    new Checia("144" , " rai " , "ua") ,
                    new Checia("622" , " max " , "ru") ,
                    new Checia("352" , " den " , "biology")
            )
    );

    @RequestMapping("/demons")
    List<Checia> getAll(){
        return checias;
    }
}
