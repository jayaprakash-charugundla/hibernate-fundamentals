package com.jc.domain.m10;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    private String street;
    private String number;
    private String zipCode;
    private String city;
}
