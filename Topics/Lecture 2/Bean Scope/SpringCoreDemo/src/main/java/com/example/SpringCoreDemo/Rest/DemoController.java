package com.example.SpringCoreDemo.Rest;

import com.example.SpringCoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
       private Coach coach;
       private Coach anothercoach;
@Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach,@Qualifier("cricketCoach") Coach theanothercoach) {
        this.coach = coach;
       anothercoach=theanothercoach;
    }


    @GetMapping("/daily")
    public String getDailyWorkout()
    {
        return coach.dailyWorkout();
    }
    @GetMapping("/check")
    public String check()
    {

        return "Comparing beans : "+(coach==anothercoach);
    }
}
