package com.jc.domain.m09;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "PAYMENTS")
public class Payment {


    @Id
    @GeneratedValue
    private int id;

    @Setter
    private int amount;

    @Setter
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "TICKET_ID", referencedColumnName = "ID"),
            @JoinColumn(name = "TICKET_NUMBER", referencedColumnName = "NUMBER")
    })
    private Ticket ticket;
}
