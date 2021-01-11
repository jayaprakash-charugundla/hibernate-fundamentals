package com.jc.domain.m15;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "TICKETS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Ticket {
    @Id
    @GeneratedValue
    private int id;

    @Setter
    private String number;
}