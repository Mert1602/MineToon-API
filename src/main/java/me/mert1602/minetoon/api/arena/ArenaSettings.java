package me.mert1602.minetoon.api.arena;

import java.util.List;

import org.bukkit.potion.PotionEffect;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.advancedapi.setting.type.bukkit.SettingLocation;
import me.mert1602.minetoon.api.IMineToon;

public interface ArenaSettings extends ISettingManager<IMineToon> {

	public List<String> getBlocks_Changeable();



	public boolean isGame_ReadyForStart_Enabled();

	public int getGame_ReadyForStart_Amount();



	public PotionEffect[] getPositive_Effects();

	public PotionEffect[] getNegative_Effects();



	public String[] getWeapons_Enabled();

	public String[] getWeapons_Disabled();



	public SettingLocation getLocation_Lobby();

	public SettingLocation getLocation_StartPoint();

	public SettingLocation getLocation_EndPoint();



	public int getTimer_Lobby();

	public int getTimer_Circle();

	public int getTimer_Ingame();

	public int getTimer_End();

}
