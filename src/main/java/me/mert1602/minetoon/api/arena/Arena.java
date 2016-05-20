package me.mert1602.minetoon.api.arena;

import me.mert1602.advancedapi.Area;
import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Deleteable;
import me.mert1602.advancedapi.Removeable;
import me.mert1602.advancedapi.Renameable;
import me.mert1602.minetoon.api.arena.game.ArenaGame;
import me.mert1602.minetoon.api.arena.team.ArenaTeamManager;

public interface Arena extends ContentInterface<ArenaManager>, Renameable, Removeable, Deleteable {

	public String getName();

	public ArenaSettings getSettings();

	public Area getArea();



	public ArenaTeamManager getTeamManager();

	public ArenaGame getGame();

}
