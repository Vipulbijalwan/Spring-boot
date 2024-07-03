package com.example.springboot.CrudDemo.RestController;

import com.example.springboot.CrudDemo.Entity.Employee;
import com.example.springboot.CrudDemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private EmployeeService employeeService;

    @Autowired
    public Controller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }
        return theEmployee;
    }

@PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);

        Employee dbEmployee=employeeService.save(theEmployee);
        return dbEmployee;

    }
@PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
    Employee dbEmployee = employeeService.save(theEmployee);

    return dbEmployee;
    }

    @DeleteMapping("employees/{employeeId}")
 public String deleteEmployee(@PathVariable int employeeId){
        Employee employee=findById(employeeId);
        if(employee==null){
            throw new RuntimeException("Id not found : "+ employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted employee id - "+employeeId;
    }
}



