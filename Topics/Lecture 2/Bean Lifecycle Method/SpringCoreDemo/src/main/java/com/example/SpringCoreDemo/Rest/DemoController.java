package com.example.SpringCoreDemo.Rest;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        this.coach = coach;

    }


    @GetMapping("/daily")
    public String getDailyWorkout() {
        return coach.dailyWorkout();
    }
}
