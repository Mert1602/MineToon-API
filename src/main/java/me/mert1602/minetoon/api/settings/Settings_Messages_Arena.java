package me.mert1602.minetoon.api.settings;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;

public interface Settings_Messages_Arena extends ISettingManager<IMineToon> {

	public String getCreated(Arena arena);

	public String getDeleted(String arenaName);

	public String getAlreadyExists(Arena arena);

	public String getNotExists(String arenaName);

	public String getRenamed(String oldArenaName, Arena newArena);

	public String getCouldNotRename(Arena arena);

	public String getLobbySet(Arena arena);

	public String getRegionSet(Arena arena);

	public String getArenaList();

}
