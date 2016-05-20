package me.mert1602.minetoon.api.user;

import org.bukkit.entity.Player;

import me.mert1602.advancedapi.LastPlayerStatus;
import me.mert1602.minetoon.api.arena.game.ArenaGame;

public interface User extends UserOffline {

	public Player getBukkitPlayer();

	public LastPlayerStatus getLastPlayerStatus();

	public ArenaGame getGame();



	public boolean hasGame();



	public void setGame(ArenaGame game);


}
