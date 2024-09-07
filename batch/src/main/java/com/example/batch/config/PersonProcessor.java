package com.example.batch.config;

import com.example.batch.person.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {
        //business logic
        person.setId(null);
        return person;
    }
}