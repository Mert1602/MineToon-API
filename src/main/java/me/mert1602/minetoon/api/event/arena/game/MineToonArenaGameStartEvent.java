package me.mert1602.minetoon.api.event.arena.game;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public final class MineToonArenaGameStartEvent extends MineToonArenaGameEventCancellable {

	public MineToonArenaGameStartEvent(IMineToon mineToon, Arena arena) {
		super(mineToon, arena);
	}

}
