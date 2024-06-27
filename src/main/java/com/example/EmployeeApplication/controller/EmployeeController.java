package com.example.EmployeeApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
     @GetMapping
    public String getEmployee(){
         return "Hai Employee";
     }
}
