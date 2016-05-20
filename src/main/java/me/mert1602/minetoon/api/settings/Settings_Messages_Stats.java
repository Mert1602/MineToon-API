package me.mert1602.minetoon.api.settings;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.user.UserOffline;

public interface Settings_Messages_Stats extends ISettingManager<IMineToon> {

	public String getOwn_Wins(int amount);

	public String getOwn_Losses(int amount);

	public String getOwn_Kills(int amount);

	public String getOwn_Deaths(int amount);

	public String getOwn_GamesPlayed(int amount);



	public String getUser_Wins(UserOffline offlineUser, int amount);

	public String getUser_Kills(UserOffline offlineUser, int amount);

	public String getUser_Deaths(UserOffline offlineUser, int amount);

	public String getUser_Losses(UserOffline offlineUser, int amount);

	public String getUser_GamesPlayed(UserOffline offlineUser, int amount);

}
