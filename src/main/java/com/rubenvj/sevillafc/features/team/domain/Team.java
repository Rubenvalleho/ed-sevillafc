package com.rubenvj.sevillafc.features.team.domain;

import com.rubenvj.sevillafc.features.employee.domain.player.domain.Player;

import java.util.ArrayList;

public class Team {
    public final String teamId;
    public final String name;
    public final String category;
    public final ArrayList<Player> players;

    public Team(String teamId, String name, String category, ArrayList<Player> players) {
        this.teamId = teamId;
        this.name = name;
        this.category = category;
        this.players = players;
    }
}
