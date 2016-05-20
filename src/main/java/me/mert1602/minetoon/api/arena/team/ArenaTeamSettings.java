package me.mert1602.minetoon.api.arena.team;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.advancedapi.setting.type.list.bukkit.SettingLocationList;
import me.mert1602.advancedapi.setting.type.numeric.SettingInteger;
import me.mert1602.minetoon.api.IMineToon;

public interface ArenaTeamSettings extends ISettingManager<IMineToon> {

	public Material getBlock_Type();

	public byte getBlock_Data();

	public void setBlock(Material type, byte data);



	public ChatColor getColor_Chat();

	public void setColor_Chat(ChatColor chatColor);



	public ItemStack getItem();

	public SettingInteger getSize_Team();

	public SettingLocationList getLocation_Ingame();

}
