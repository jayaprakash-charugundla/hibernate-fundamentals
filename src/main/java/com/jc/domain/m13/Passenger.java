package com.jc.domain.m13;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "PASSENGERS")
public class Passenger {

    @Getter
    @Id
    @GeneratedValue
    private int id;

    @Getter
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
}
