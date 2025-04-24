package org.example.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {


    @GeneratedValue
    private long Id;

    private String role;

    private String name;



}
