package me.mert1602.minetoon.api.sign;

import org.bukkit.Location;

import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.advancedapi.basic.Loadable;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Startable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public interface SignManager extends ContentManager<Sign, IMineToon>, Loadable, Startable, Reloadable, Stopable {

	public Sign getSign(String id);

	public Sign addSign(Location location, Arena arena);

	public Sign addSavedSign(String id);

	public void addDefault();

	public void addFolder();

}
