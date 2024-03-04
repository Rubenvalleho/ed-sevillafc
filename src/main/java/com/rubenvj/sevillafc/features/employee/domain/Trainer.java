package com.rubenvj.sevillafc.features.employee.domain;

import com.rubenvj.sevillafc.features.employee.domain.Employee;

public class Trainer extends Employee {
    public final String strategy;

    public Trainer(String employeeId, String name, String lastName, String bornDate, String strategy) {
        super(employeeId, name, lastName, bornDate);
        this.strategy = strategy;
    }
}
