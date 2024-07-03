package com.example.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define dependency inj of coach class
    private Coach coach;

    //using constructor of dependency inj
@Autowired  // If we have only one constructor we do not use @Autowired annotation
//if we have more than two constructor we need  @Autowired annotation in every method.
    public DemoController(Coach coach) {
        this.coach = coach;
    }
    @GetMapping("/daily")
    public String getDailyWorkout()
    {
        return coach.dailyWorkout();
    }
}
