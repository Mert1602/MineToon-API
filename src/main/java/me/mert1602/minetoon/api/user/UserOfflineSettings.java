package me.mert1602.minetoon.api.user;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.advancedapi.setting.type.SettingString;
import me.mert1602.advancedapi.setting.type.list.SettingStringList;
import me.mert1602.advancedapi.setting.type.numeric.SettingInteger;
import me.mert1602.minetoon.api.IMineToon;

public interface UserOfflineSettings extends ISettingManager<IMineToon> {

	public SettingString getName();



	public SettingStringList getWeapons_Bought();



	public SettingInteger getStats_Game_Wins();

	public SettingInteger getStats_Game_Losses();

	public SettingInteger getStats_Game_Kills();

	public SettingInteger getStats_Game_Deaths();

	public SettingInteger getStats_Game_Played();

}
