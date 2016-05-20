package me.mert1602.minetoon.api.event.arena.team;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.team.ArenaTeam;

public final class MineToonArenaTeamRemoveEvent extends MineToonArenaTeamEvent {

	public MineToonArenaTeamRemoveEvent(IMineToon mineToon, ArenaTeam team) {
		super(mineToon, team);
	}

}
