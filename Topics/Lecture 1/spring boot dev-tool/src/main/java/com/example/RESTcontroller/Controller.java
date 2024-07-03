package com.example.RESTcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home(){
        return "HELLO CONTROLLER VIPUL";
    }
    @GetMapping("/work")
    public String work(){
        return "I AM WORKING TODAY";
    }

}
