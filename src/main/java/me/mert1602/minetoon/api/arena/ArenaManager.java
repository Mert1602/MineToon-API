package me.mert1602.minetoon.api.arena;

import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.advancedapi.basic.Loadable;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Startable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.IMineToon;

public interface ArenaManager extends ContentManager<Arena, IMineToon>, Loadable, Startable, Reloadable, Stopable {

	public Arena getArena(String name);

	public Arena addArena(String name);

	public void addDefault();

	public void addFolder();

}
