package me.mert1602.minetoon.api.event.arena.game;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.user.User;

public class MineToonArenaGameUserAddEvent extends MineToonArenaGameEventCancellable {

	@Getter private final User user;
	@Getter private final boolean bungeecord;

	public MineToonArenaGameUserAddEvent(IMineToon mineToon, Arena arena, User user, boolean bungeecord) {
		super(mineToon, arena);

		this.user = user;
		this.bungeecord = bungeecord;

	}

}
