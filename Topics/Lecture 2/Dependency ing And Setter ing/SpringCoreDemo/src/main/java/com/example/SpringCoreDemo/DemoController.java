package com.example.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
       private Coach coach;

       @Autowired//Setter injection
public void setCoach(Coach thecoach)
{
    coach=thecoach;
}


    @GetMapping("/daily")
    public String getDailyWorkout()
    {
        return coach.dailyWorkout();
    }
}
