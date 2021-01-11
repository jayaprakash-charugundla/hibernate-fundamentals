package com.jc.domain.m01;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "PASSENGERS")
public class Passenger {

    @Getter
    @Id
    @Column(name = "PASSENGER_ID")
    private int id;

    @Getter
    @Column(name = "PASSENGER_NAME", table = "PASSENGERS")
    private String name;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "AIRPORT_ID")
    private Airport airport;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets = new ArrayList<>();

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(this.tickets);
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
}
