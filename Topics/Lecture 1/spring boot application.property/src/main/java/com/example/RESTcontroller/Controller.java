package com.example.RESTcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    // inject properties
@Value("${team.name}")
    private String teamName;
@Value("${leader.name}")
private String leaderName;

//expose new endpoint for "TeamInfo"
@GetMapping("/TeamInfo")
public String getTeamInfo(){
    return "Team : "+teamName+ ",  Leader : "+leaderName;
}


    @GetMapping("/")
    public String home(){
        return "HELLO CONTROLLER VIPUL";
    }
    @GetMapping("/work")
    public String work(){
        return "I AM WORKING TODAY";
    }

}
