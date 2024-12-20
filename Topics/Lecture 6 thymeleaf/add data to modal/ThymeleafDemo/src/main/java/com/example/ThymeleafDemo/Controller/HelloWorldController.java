package com.example.ThymeleafDemo.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

        //need a controller method to show initial HTML form
      @RequestMapping("/showForm")
        public String showForm(){
                return "helloworld-form";
        }

        //need a controller method to process the HTML form
   @RequestMapping("/processForm")
    public String processForm(){
          return "helloworld";
    }
    
    //need a controller method to read from data
    //add data to modal
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        //read the request parameter from the HTML form
String theName=request.getParameter("studentName");
        //convert the data to all caps
theName=theName.toUpperCase();
        //create the message
String result="Yo" + theName;
        //add msg to modal
model.addAttribute("message",result);
          return "helloworld";
    }
}
