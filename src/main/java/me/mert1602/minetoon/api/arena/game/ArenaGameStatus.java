package me.mert1602.minetoon.api.arena.game;

import lombok.Getter;

public enum ArenaGameStatus {

	WAITING(false),
	LOBBY(true),
	CIRCLE(true),
	INGAME(true),
	END(true),
	STOP(false);

	@Getter
	private boolean countable;

	private ArenaGameStatus(boolean countable) {
		this.countable = countable;
	}

}
