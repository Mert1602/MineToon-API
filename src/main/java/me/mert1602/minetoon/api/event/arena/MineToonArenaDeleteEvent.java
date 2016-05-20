package me.mert1602.minetoon.api.event.arena;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public final class MineToonArenaDeleteEvent extends MineToonArenaEvent {

	public MineToonArenaDeleteEvent(IMineToon mineToon, Arena arena) {
		super(mineToon, arena);
	}

}
