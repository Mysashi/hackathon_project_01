package com.hackathon.demo.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Event {

    @GeneratedValue
    private long Id;

    private String name;
}
