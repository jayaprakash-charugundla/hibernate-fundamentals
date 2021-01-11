package com.jc.domain.m02;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "PASSENGERS")
@SecondaryTable(name = "ADDRESSES", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID", referencedColumnName = "PASSENGER_ID"))
public class Passenger {

    @Getter
    @Id
    @Column(name = "PASSENGER_ID")
    private int id;

    @Getter
    @Column(name = "PASSENGER_NAME", table = "PASSENGERS")
    private String name;

    @Getter
    @Column(name = "PASSENGER_ADDRESS", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    private String address;

    public Passenger(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

}
