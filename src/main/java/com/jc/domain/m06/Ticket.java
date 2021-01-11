package com.jc.domain.m06;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TICKETS")
public class Ticket {

    @EmbeddedId
    private TicketKey id;
    private String origin;
    private String destination;

}
