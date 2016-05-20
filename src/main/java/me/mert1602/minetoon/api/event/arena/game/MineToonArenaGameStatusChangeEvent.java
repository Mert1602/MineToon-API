package me.mert1602.minetoon.api.event.arena.game;

import lombok.Getter;
import lombok.Setter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.arena.game.ArenaGameStatus;

public final class MineToonArenaGameStatusChangeEvent extends MineToonArenaGameEventCancellable {

	@Getter private final ArenaGameStatus oldStatus;
	@Getter @Setter private ArenaGameStatus newStatus;

	public MineToonArenaGameStatusChangeEvent(IMineToon mineToon, Arena arena, ArenaGameStatus oldStatus, ArenaGameStatus newStatus) {
		super(mineToon, arena);

		this.oldStatus = oldStatus;
		this.newStatus = newStatus;

	}

}
