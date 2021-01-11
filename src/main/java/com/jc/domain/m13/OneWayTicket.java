package com.jc.domain.m13;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ONE_WAY_TICKET")
public class OneWayTicket extends Ticket {
    private LocalDate latestDepartureDate;
}
