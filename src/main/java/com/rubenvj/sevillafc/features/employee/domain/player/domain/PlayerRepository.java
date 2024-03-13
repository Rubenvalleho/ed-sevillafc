package com.rubenvj.sevillafc.features.employee.domain.player.domain;

import java.util.ArrayList;

public interface PlayerRepository {
    public Player getPlayer(String employeeId);
    public void savePlayer(Player player);
    public ArrayList<Player> getPlayers();
}
