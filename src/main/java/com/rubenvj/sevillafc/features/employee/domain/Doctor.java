package com.rubenvj.sevillafc.features.employee.domain;

import com.rubenvj.sevillafc.features.employee.domain.Employee;

import java.util.function.DoubleConsumer;

public class Doctor extends Employee {

    public final String especiality;

    public Doctor(String employeeId, String name, String lastName, String bornDate, String especiality) {
        super(employeeId, name, lastName, bornDate);
        this.especiality = especiality;
    }
}
