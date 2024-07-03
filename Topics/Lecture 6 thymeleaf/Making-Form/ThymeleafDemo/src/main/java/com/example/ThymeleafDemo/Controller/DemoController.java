package com.example.ThymeleafDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    //create a mapping
    @GetMapping("/hello")
    public String sayHello(Model themodel){
        themodel.addAttribute("theDate",java.time.LocalDateTime.now());

        return "helloworld";
    }
}
