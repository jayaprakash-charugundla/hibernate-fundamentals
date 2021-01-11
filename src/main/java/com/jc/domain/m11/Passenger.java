package com.jc.domain.m11;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "PASSENGERS")
public class Passenger {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "PASSENGER_TICKETS", joinColumns = {
            @JoinColumn(name = "PASSENGER_ID", referencedColumnName = "ID")
    })
    private List<Ticket> tickets = new ArrayList<>();

    @ElementCollection
    @MapKeyColumn(name = "ATTRIBUTE_NAME")
    @Column(name = "ATTRIBUTE_VALUE")
    @CollectionTable(name = "PASSENGER_ATTRIBUTES", joinColumns = {
            @JoinColumn(name = "PASSENGER_ID", referencedColumnName = "ID")
    })
    private Map<String, String> attributes = new HashMap<>();


    public Passenger(String name) {
        this.name = name;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(this.tickets);
    }

    public void addAttribute(String key, String value) {
        this.attributes.put(key, value);
    }

    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }
}
