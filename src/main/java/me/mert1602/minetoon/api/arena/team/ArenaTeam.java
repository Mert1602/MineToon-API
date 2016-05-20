package me.mert1602.minetoon.api.arena.team;

import java.util.List;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Deleteable;
import me.mert1602.advancedapi.Removeable;
import me.mert1602.advancedapi.Renameable;
import me.mert1602.minetoon.api.user.User;

public interface ArenaTeam extends ContentInterface<ArenaTeamManager>, Renameable, Removeable, Deleteable {

	public String getName();

	public ArenaTeamSettings getSettings();

	public List<User> getUserList();

	public List<User> getMFAUserList();

	public List<String> getMFABlockList();

}
