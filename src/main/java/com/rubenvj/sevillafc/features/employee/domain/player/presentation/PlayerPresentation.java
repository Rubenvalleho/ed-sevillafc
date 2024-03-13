package com.rubenvj.sevillafc.features.employee.domain.player.presentation;

import com.rubenvj.sevillafc.features.employee.domain.player.data.PlayerDataRepository;
import com.rubenvj.sevillafc.features.employee.domain.player.domain.CreatePlayerUseCase;
import com.rubenvj.sevillafc.features.employee.domain.player.domain.GetPlayerUseCase;
import com.rubenvj.sevillafc.features.employee.domain.player.domain.GetPlayersUseCase;
import com.rubenvj.sevillafc.features.employee.domain.player.domain.Player;

public class PlayerPresentation {
    public static void savePlayer(Player player) {
        PlayerDataRepository playerDataRepository = new PlayerDataRepository();
        CreatePlayerUseCase createPlayerUseCase = new CreatePlayerUseCase(playerDataRepository);
        createPlayerUseCase.execute(player);
    }

    public static void recuperarJugador(String employeeId) {
        PlayerDataRepository playerDataRepository = new PlayerDataRepository();
        GetPlayerUseCase getPlayerUseCase = new GetPlayerUseCase(playerDataRepository);
        getPlayerUseCase.execute(employeeId);
    }

    public static void recuperarJugadores() {
        PlayerDataRepository playerDataRepository = new PlayerDataRepository();
        GetPlayersUseCase getPlayersUseCase = new GetPlayersUseCase(playerDataRepository);
        getPlayersUseCase.execute();
    }
}
