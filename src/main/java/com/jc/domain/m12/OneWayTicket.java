package com.jc.domain.m12;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class OneWayTicket extends Ticket {
    private LocalDate latestDepartureDate;
}
