package me.mert1602.minetoon.api.event.arena.game;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public final class MineToonArenaGameCountdownTickEvent extends MineToonArenaGameEventCancellable {

	public MineToonArenaGameCountdownTickEvent(IMineToon mineToon, Arena arena) {
		super(mineToon, arena);
	}

}
