package me.mert1602.minetoon.api.hd;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.advancedapi.setting.type.bukkit.SettingLocation;
import me.mert1602.minetoon.api.HolographicDisplaysMode;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.user.User;

public interface HDSettings extends ISettingManager<IMineToon> {

	public HolographicDisplaysMode getMode();

	public void setMode(HolographicDisplaysMode mode);



	public Arena getArena();

	public boolean isArena_JoinPerTouch();

	public SettingLocation getLocation();



	public String[] getFormat_User(User user);

	public String[] getFormat_Arena();

	public String[] getFormat_Global();

}
