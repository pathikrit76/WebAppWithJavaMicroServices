package com.tutorial.webappdemo.service;

import com.tutorial.webappdemo.entity.Person;
import com.tutorial.webappdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> getAllEmployees(){
        return personRepository.findAll();
    }

    public Person addEmployee(Person person){
        return personRepository.save(person);
    }
}
