package me.mert1602.minetoon.api.hd;

import org.bukkit.Location;

import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.advancedapi.basic.Loadable;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Startable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public interface HDManager extends ContentManager<HD, IMineToon>, Loadable, Startable, Reloadable, Stopable {

	public HD getHD(int id);

	public HD addHD(Location location, Arena arena);

	public HD addSavedHD(int id);

	public void addDefault();

	public void addFolder();

}
