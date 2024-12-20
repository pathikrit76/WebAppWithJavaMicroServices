package com.tutorial.webappdemo.controller;

import com.tutorial.webappdemo.entity.Person;
import com.tutorial.webappdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person> getEmployees(){
        return personService.getAllEmployees();
    }

    @PostMapping("/persons")
    public Person addEmployee(@RequestBody Person person){
        return personService.addEmployee(person);
    }
}
