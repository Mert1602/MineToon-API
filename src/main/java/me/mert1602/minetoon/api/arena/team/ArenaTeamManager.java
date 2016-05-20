package me.mert1602.minetoon.api.arena.team;

import me.mert1602.advancedapi.Removeable;
import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.minetoon.api.arena.Arena;

public interface ArenaTeamManager extends ContentManager<ArenaTeam, Arena>, Removeable {

	public ArenaTeam getTeam(String name);

	public ArenaTeam addTeam(String name);

	public void addDefault();

	public void addFolder();

}
