package com.jc.domain.m10;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "PASSENGERS")
public class Passenger {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @Setter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "PASSENGER_STREET")),
            @AttributeOverride(name = "number", column = @Column(name = "PASSENGER_NUMBER")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "PASSENGER_ZIP_CODE")),
            @AttributeOverride(name = "city", column = @Column(name = "PASSENGER_CITY"))

    })
    private Address address;

    public Passenger(String name) {
        this.name = name;
    }
}
