package com.hackathon.demo.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Hackathon {

    @GeneratedValue
    private long id;

    private String description;

    private String name;

    private Date created_at;

    private Date ended_at;
}
