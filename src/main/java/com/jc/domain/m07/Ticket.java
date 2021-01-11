package com.jc.domain.m07;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TICKETS")
@IdClass(TicketKey.class)
public class Ticket {
    @Id
    private String series;
    private String number;
    private String origin;
    private String destination;

}
