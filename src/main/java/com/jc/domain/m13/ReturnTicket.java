package com.jc.domain.m13;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AssociationOverride;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "RETURN_TICKET")
@AssociationOverride(name = "passenger", joinColumns = @JoinColumn(name = "PASS_ID"))
public class ReturnTicket extends Ticket {
    private LocalDate latestReturnDate;
}
