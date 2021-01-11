package com.jc.domain.m18;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "COUNTRIES")
@EqualsAndHashCode(exclude = {"id"})
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE_NAME")
    private String codeName;

    public Country(String name, String codeName) {
        this.name = name;
    }
}
