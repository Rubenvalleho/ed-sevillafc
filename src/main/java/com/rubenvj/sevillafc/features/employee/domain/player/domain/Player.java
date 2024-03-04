package com.rubenvj.sevillafc.features.employee.domain.player.domain;

import com.rubenvj.sevillafc.features.employee.domain.Employee;

public class Player extends Employee {
    public final String demarcation;

    public Player(String employeeId, String name, String lastName, String bornDate, String demarcation) {
        super(employeeId, name, lastName, bornDate);
        this.demarcation = demarcation;
    }
}
