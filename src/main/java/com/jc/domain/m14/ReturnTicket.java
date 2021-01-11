package com.jc.domain.m14;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@DiscriminatorValue("1")
public class ReturnTicket extends Ticket {
    private LocalDate latestReturnDate;
}
