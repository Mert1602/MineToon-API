package me.mert1602.minetoon.api.arena.game;

import me.mert1602.minetoon.api.user.User;

public interface ArenaGame extends ArenaGameBasic_Team {

	public ArenaGameCountdown getCountdown();

	public ArenaGameScoreboardUpdater getScoreboardUpdater();

	public ArenaGameInventoryUpdater getInventoryUpdater();

	public ArenaGameHideUpdater getHideUpdater();



	public boolean isStartable();

	public boolean isReadyForStart();

	public boolean isFull();

	public int getMaxPlayers();

	public void sendMessage(String... strings);



	public void addSpectator(User user);

	public void addUser(User user, boolean bungeecord);

	public void removeUser(User user, boolean bungeecord);



	public void start();

	public void stop(boolean restart);

}
