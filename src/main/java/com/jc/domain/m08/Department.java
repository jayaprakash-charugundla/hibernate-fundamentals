package com.jc.domain.m08;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "DEPARTMENTS")
public class Department {


    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Department(String name) {
        this.name = name;
    }

}
