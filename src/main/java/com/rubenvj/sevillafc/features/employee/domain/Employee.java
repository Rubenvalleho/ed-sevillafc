package com.rubenvj.sevillafc.features.employee.domain;

public class Employee {
    public final String employeeId;
    public final String name;
    public final String lastName;
    public final String bornDate;

    public Employee(String employeeId, String name, String lastName, String bornDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.lastName = lastName;
        this.bornDate = bornDate;
    }
}
