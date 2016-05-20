package me.mert1602.minetoon.api.sign;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.advancedapi.setting.type.bukkit.SettingLocation;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public interface SignSettings extends ISettingManager<IMineToon> {

	public Arena getArena();

	public SettingLocation getLocation();

}
