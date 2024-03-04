package com.rubenvj.sevillafc.features.match.domain;

import com.rubenvj.sevillafc.features.referee.domain.Referee;
import com.rubenvj.sevillafc.features.team.domain.Team;

public class Match {
    public final String matchId;
    public final Team localTeam;
    public final Team visitorTeam;
    public final Referee referee;
    public final String result;
    public final String matchDay;

    public Match(String matchId, Team localTeam, Team visitorTeam, Referee referee, String result, String matchDay) {
        this.matchId = matchId;
        this.localTeam = localTeam;
        this.visitorTeam = visitorTeam;
        this.referee = referee;
        this.result = result;
        this.matchDay = matchDay;
    }
}
