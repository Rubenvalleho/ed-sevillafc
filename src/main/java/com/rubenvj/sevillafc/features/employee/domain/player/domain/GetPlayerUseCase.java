package com.rubenvj.sevillafc.features.employee.domain.player.domain;

import com.rubenvj.sevillafc.features.employee.domain.player.data.PlayerDataRepository;

public class GetPlayerUseCase {
    private PlayerRepository playerRepository;

    public GetPlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player execute(String employeeId) {
        return playerRepository.getPlayer(employeeId);
    }
}
