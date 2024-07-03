package com.example.SpringCoreDemo.Rest;

import com.example.SpringCoreDemo.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define dependency inj of coach class
    private Coach coach;


@Autowired
    public DemoController(Coach coach) {
        this.coach = coach;
    }
    @GetMapping("/daily")
    public String getDailyWorkout()
    {
        return coach.dailyWorkout();
    }
}
