package me.mert1602.minetoon.api.event.arena.team;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.team.ArenaTeam;

public final class MineToonArenaTeamDeleteEvent extends MineToonArenaTeamEvent {

	public MineToonArenaTeamDeleteEvent(IMineToon mineToon, ArenaTeam team) {
		super(mineToon, team);
	}

}
