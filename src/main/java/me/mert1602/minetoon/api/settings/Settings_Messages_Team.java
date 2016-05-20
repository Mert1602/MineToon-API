package me.mert1602.minetoon.api.settings;

import org.bukkit.ChatColor;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.arena.team.ArenaTeam;

public interface Settings_Messages_Team extends ISettingManager<IMineToon> {

	public String getCreated(Arena arena, ArenaTeam team);

	public String getDeleted(Arena arena, String teamname);

	public String getAlreadyExists(Arena arena, ArenaTeam team);

	public String getNotExists(Arena arena, String teamname);

	public String getRenamed(Arena arena, String teamName, String newTeamName);

	public String getCouldNotRename(Arena arena, ArenaTeam team);

	public String getIngameLocationAdded(Arena arena, ArenaTeam team);

	public String getIngameLocationsCleared(Arena arena, ArenaTeam team);

	public String getChatColorSet(Arena arena, ArenaTeam team, ChatColor chatcolor);

	public String getMaxTeamSizeSet(Arena arena, ArenaTeam team);

	public String getBlockSet(Arena arena, ArenaTeam team);

	public String getTeamList(Arena arena);

}
