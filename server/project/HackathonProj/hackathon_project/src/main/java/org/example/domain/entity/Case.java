package org.example.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Case {


    @GeneratedValue
    private long Id;

    private String name;
}
