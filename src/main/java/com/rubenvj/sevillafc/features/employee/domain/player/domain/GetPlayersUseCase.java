package com.rubenvj.sevillafc.features.employee.domain.player.domain;

import com.rubenvj.sevillafc.features.employee.domain.player.data.PlayerDataRepository;

import java.util.ArrayList;

public class GetPlayersUseCase {
    private PlayerRepository playerRepository;
    public GetPlayersUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public ArrayList<Player> execute() {
      return playerRepository.getPlayers();
    }
}
