package com.jc.domain.m13;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@MappedSuperclass
public abstract class Ticket {
    @Id
    @GeneratedValue
    private int id;

    @Setter
    private String number;

    @Setter
    @ManyToOne
    @JoinColumn(name = "PASSENGER_ID")
    private Passenger passenger;
}