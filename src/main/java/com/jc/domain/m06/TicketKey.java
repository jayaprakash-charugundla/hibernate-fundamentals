package com.jc.domain.m06;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class TicketKey implements Serializable {
    private String series;
    private String number;
}
