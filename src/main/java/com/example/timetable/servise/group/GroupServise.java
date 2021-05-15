package com.example.timetable.servise.group;

import com.example.timetable.model.Group;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class GroupServise {

    private List<Group> groups = new ArrayList<>(
            Arrays.asList(
                    new Group("46738" , "mark" ) ,
                    new Group("12548" , "kolt" ) ,
                    new Group("64338" , "oleg" ) ,
                    new Group("35538" , "eola" ) ,
                    new Group("50038" , "sara" )
            )
    );

    public List<Group> getGroups(){
        return groups;

    }

    public Group getGroupById(String id){

        return groups.get(0);

    }

}
