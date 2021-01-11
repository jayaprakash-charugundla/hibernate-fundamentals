package com.jc.domain.m09;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "TICKETS")
public class Ticket {

    @Id
    @Column(name = "ID")
    private int id;

    @Setter
    @Column(name = "NUMBER")
    private String number;

    @Setter
    private String origin;

    @Setter
    private String destination;

}