package com.jc.domain.m04;

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
@SecondaryTables(
        {
                @SecondaryTable(name = "ADDRESSES", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID",
                        referencedColumnName = "PASSENGER_ID")),
                @SecondaryTable(name = "PHONES", pkJoinColumns = @PrimaryKeyJoinColumn(name = "PASSENGER_ID",
                        referencedColumnName = "PASSENGER_ID"))
        }
)

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

    @Getter
    @Setter
    @Column(name = "AREA_CODE", table = "PHONES", columnDefinition = "varchar(5) not null")
    private String areaCode;

    @Getter
    @Setter
    @Column(name = "PREFIX", table = "PHONES", columnDefinition = "varchar(5) not null")
    private String prefix;

    @Getter
    @Setter
    @Column(name = "LINE_NUMBER", table = "PHONES", columnDefinition = "varchar(10) not null")
    private String lineNumber;

    public Passenger(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
