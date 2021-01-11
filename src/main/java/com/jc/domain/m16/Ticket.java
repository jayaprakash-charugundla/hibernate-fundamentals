package com.jc.domain.m16;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "TICKETS")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Ticket {
    @Id
    @GeneratedValue
    private int id;

    @Setter
    private String number;
}