package com.example.batch.person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
}