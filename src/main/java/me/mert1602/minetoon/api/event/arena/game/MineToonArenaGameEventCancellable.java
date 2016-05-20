package me.mert1602.minetoon.api.event.arena.game;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.arena.game.ArenaGame;
import me.mert1602.minetoon.api.event.arena.MineToonArenaEventCancellable;

class MineToonArenaGameEventCancellable extends MineToonArenaEventCancellable {

	@Getter private final ArenaGame game;

	public MineToonArenaGameEventCancellable(IMineToon mineToon, Arena arena) {
		super(mineToon, arena);

		this.game = this.getArena().getGame();

	}

}
