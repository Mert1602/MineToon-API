package me.mert1602.minetoon.api.settings;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.team.ArenaTeam;
import me.mert1602.minetoon.api.user.User;
import me.mert1602.minetoon.api.weapon.Weapon;

public interface Settings_Messages_Game extends ISettingManager<IMineToon> {

	public String getStartingIn(int seconds, String secondformat);

	public String getStarted();

	public String getStoppingIn(int seconds, String secondformat);

	public String getStopped();

	public String getRestartIn(int seconds, String secondformat);



	public String getNotEnoughPlayers();

	public String getHasNoGame();

	public String getAlreadyInThisGame();

	public String getIsRestarting();

	public String getJoined(User user);

	public String getLeft(User user);

	public String getLeftPlayer();

	public String getTeamWon(ArenaTeam team);

	public String getIsFull();



	public String getDeath(User user);

	public String getDeathByPlayer(User user, User killer);

	public String getDeathByPlayerWithWeapon(User user, User killer, Weapon weapon);

}
