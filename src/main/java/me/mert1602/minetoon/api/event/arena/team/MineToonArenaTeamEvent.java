package me.mert1602.minetoon.api.event.arena.team;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.team.ArenaTeam;
import me.mert1602.minetoon.api.event.arena.MineToonArenaEvent;

class MineToonArenaTeamEvent extends MineToonArenaEvent {

	@Getter private final ArenaTeam team;

	public MineToonArenaTeamEvent(IMineToon mineToon, ArenaTeam team) {
		super(mineToon, team.getContent().getContent());

		this.team = team;

	}

}
