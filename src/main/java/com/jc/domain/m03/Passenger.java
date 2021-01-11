package com.jc.domain.m03;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Setter
    @Column(name = "STREET", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    private String street;

    @Getter
    @Setter
    @Column(name = "NUMBER", table = "ADDRESSES", columnDefinition = "varchar(10) not null")
    private String number;

    @Getter
    @Setter
    @Column(name = "ZIP_CODE", table = "ADDRESSES", columnDefinition = "varchar(10) not null")
    private String zipCode;

    @Getter
    @Setter
    @Column(name = "CITY", table = "ADDRESSES", columnDefinition = "varchar(25) not null")
    private String city;

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
