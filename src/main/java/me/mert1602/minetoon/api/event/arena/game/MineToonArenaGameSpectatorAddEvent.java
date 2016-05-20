package me.mert1602.minetoon.api.event.arena.game;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.user.User;

public final class MineToonArenaGameSpectatorAddEvent extends MineToonArenaGameEventCancellable {

	@Getter private final User user;

	public MineToonArenaGameSpectatorAddEvent(IMineToon mineToon, Arena arena, User user) {
		super(mineToon, arena);

		this.user = user;

	}

}
