package com.jc.domain.m08;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "MANAGERS")
public class Manager {


    @Id
    @GeneratedValue
    private int id;

    @Setter
    private String name;

    @Setter
    @OneToOne
    @JoinTable(name = "MANAGER_TO_DEPARTMENT",
            joinColumns = {@JoinColumn(name = "MANAGER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "ID", nullable = false)})
    private Department department;

    public Manager(String name) {
        this.name = name;
    }
}
