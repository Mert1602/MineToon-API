package me.mert1602.minetoon.api.event.arena;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.arena.ArenaManager;
import me.mert1602.minetoon.api.event.MineToonEventCancellable;

public class MineToonArenaEventCancellable extends MineToonEventCancellable {

	@Getter private final Arena arena;
	@Getter private final ArenaManager arenaManager;

	public MineToonArenaEventCancellable(IMineToon mineToon, Arena arena) {
		super(mineToon);

		this.arena = arena;
		this.arenaManager = this.arena.getContent();

	}

}
