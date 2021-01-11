package com.jc.domain.m16;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "RETURN_TICKET")
public class ReturnTicket extends Ticket {
    private LocalDate latestReturnDate;
}
