package me.mert1602.minetoon.api.arena.game;

import java.util.List;

import me.mert1602.minetoon.api.arena.team.ArenaTeam;
import me.mert1602.minetoon.api.user.User;

public interface ArenaGameBasic_Team extends ArenaGameBasic_BukkitTask {

	public boolean hasTeam(User user);

	public ArenaTeam getTeam(User user);

	public List<ArenaTeam> getWinnerTeamList();

	public ArenaTeam addUserToTeam(User user);

	public void removeUserFromTeam(User user);

}
