package com.rubenvj.sevillafc.features.employee.domain.player.domain;

import com.rubenvj.sevillafc.features.employee.domain.player.data.PlayerDataRepository;

public class CreatePlayerUseCase {
    private PlayerRepository playerRepository;

    public CreatePlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void execute(Player player) {
        playerRepository.savePlayer(player);
    }
}
