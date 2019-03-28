package com.araltiparmak.yamlreader.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    Persons persons;

    @GetMapping("/persons")
    public String getPersons() {
        return persons.getPersonMap().toString();
    }
}
