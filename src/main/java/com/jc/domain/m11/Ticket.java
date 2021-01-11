package com.jc.domain.m11;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Embeddable
public class Ticket {
    private String number;

    public Ticket(String number) {
        this.number = number;
    }
}