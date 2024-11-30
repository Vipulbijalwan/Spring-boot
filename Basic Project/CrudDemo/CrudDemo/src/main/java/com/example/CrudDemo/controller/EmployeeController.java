package com.example.CrudDemo.controller;


import com.example.CrudDemo.service.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @Autowired
    private ServiceImp serviceImp;

    @GetMapping("/")
    public String home(){
        return "index";

    }

    @GetMapping("/add_emp")
    public String addEmp(){
        return "add_emp";

    }
//    @PostMapping("/add")
//    public String addProduct(@RequestBody Product product){
//         serviceImp.addProduct(product);
//         return "Product add";
//    }
//
//    @GetMapping("/show/{Id}")
//    public Product findById(@RequestParam int Id){
//        return serviceImp.findById(Id);
//    }

}
