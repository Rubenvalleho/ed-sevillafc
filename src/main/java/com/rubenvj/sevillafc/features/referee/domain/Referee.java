package com.rubenvj.sevillafc.features.referee.domain;

public class Referee {
    public final String refereeId;
    public final String name;
    public final String lastName;
    public final String bornDate;
    public final String category;

    public Referee(String refereeId, String name, String lastName, String bornDate, String category) {
        this.refereeId = refereeId;
        this.name = name;
        this.lastName = lastName;
        this.bornDate = bornDate;
        this.category = category;
    }
}
