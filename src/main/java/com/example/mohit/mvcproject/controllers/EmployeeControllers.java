package com.example.mohit.mvcproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.mohit.mvcproject.entity.Employee;
import com.example.mohit.mvcproject.repository.EmployeeRepository;

@Controller
public class EmployeeControllers {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getForm")
    public String getForm(
            Model model) {

        model.addAttribute(
                "employeeEntry",
                new Employee());

        return "register";
    }

    
    //save employees data
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {

        System.out.println("First Name = " + employee.getfName());
        System.out.println("Last Name = " + employee.getlName());

        employeeRepository.save(employee);

        return "success";
        //return "redirect:/employees";
    }
    
        
    // Get all employees data
    //http://localhost:8080/employees
    @GetMapping("/employees")
    public String showEmployees(Model model) {

        model.addAttribute(
                "employees",
                employeeRepository.findAll());

        return "employees";
    }
    
}