package com.jc.domain.m01;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "AIRPORTS")
@Access(AccessType.FIELD)
public class Airport {

    @Getter
    @Id
    @Column(name = "ID")
    private int id;

    @Getter
    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "airport")
    private List<Passenger> passengers = new ArrayList<>();

    public Airport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Passenger> getPassengers() {
        return Collections.unmodifiableList(this.passengers);
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}
