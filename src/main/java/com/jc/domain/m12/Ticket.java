package com.jc.domain.m12;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "TICKETS")
public abstract class Ticket {
    @Id
    @GeneratedValue
    private int id;

    @Setter
    private String number;
}