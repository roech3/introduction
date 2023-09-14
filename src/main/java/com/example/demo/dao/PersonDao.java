package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.UUID;

public interface PersonDao {

    int InsertPerson (UUID id, Person person);
    default int addPerson(PersonDao person) {
        UUID id = UUID.randomUUID();
        return person.InsertPerson(id, person);
    }
}
