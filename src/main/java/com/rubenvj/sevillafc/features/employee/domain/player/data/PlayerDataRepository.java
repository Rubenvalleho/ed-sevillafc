package com.rubenvj.sevillafc.features.employee.domain.player.data;

import com.rubenvj.sevillafc.features.employee.domain.player.data.local.PlayerFileLocalDataSource;
import com.rubenvj.sevillafc.features.employee.domain.player.domain.Player;
import com.rubenvj.sevillafc.features.employee.domain.player.domain.PlayerRepository;

import java.util.ArrayList;

public class PlayerDataRepository implements PlayerRepository {
    PlayerFileLocalDataSource playerFileLocalDataSource;

    public PlayerDataRepository() {
        this.playerFileLocalDataSource = new PlayerFileLocalDataSource();
    }


    @Override
    public Player getPlayer(String employeeId) {
        return playerFileLocalDataSource.obtainPlayer(employeeId);
    }

    @Override
    public void savePlayer(Player player) {
        playerFileLocalDataSource.savePlayer(player);
    }

    @Override
    public ArrayList<Player> getPlayers() {
        return playerFileLocalDataSource.obtainPlayers();
    }
}
