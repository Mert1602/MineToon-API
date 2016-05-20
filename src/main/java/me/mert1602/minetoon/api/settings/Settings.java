package me.mert1602.minetoon.api.settings;

import org.bukkit.ChatColor;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.arena.Arena;
import me.mert1602.minetoon.api.arena.team.ArenaTeam;
import me.mert1602.minetoon.api.user.User;

public interface Settings extends ISettingManager<IMineToon> {

	public boolean isDebug();

	public String getPrefix();



	public int isBungeeCord_Enabled();

	public String getBungeeCord_FallbackServer();

	public Arena getBungeeCord_Arena();

	public long getBungeeCord_Time_KickPlayerIfNotDisconnected();

	public String getBungeeCord_Arena_Name();

	public String getBungeeCord_Message_Full();

	public String getBungeeCord_Message_Restart();

	public String getBungeeCord_Message_Unknown();



	public boolean isReward_Death_Enabled();

	public double getReward_Death_Amount();

	public boolean isReward_Kill_Enabled();

	public double getReward_Kill_Amount();

	public boolean isReward_Lose_Enabled();

	public double getReward_Lose_Amount();

	public boolean isReward_Win_Enabled();

	public double getReward_Win_Amount();



	public boolean isReward_Command_Death_Enabled();

	public String getReward_Command_Death_Command(User user);

	public boolean isReward_Command_Kill_Enabled();

	public String getReward_Command_Kill_Command(User user);

	public boolean isReward_Command_Lose_Enabled();

	public String getReward_Command_Lose_Command(User user);

	public boolean isReward_Command_Win_Enabled();

	public String getReward_Command_Win_Command(User user);



	public String getFormat_Second();

	public String getFormat_Seconds();

	public String getFormat_PlayerListName(User user);

	public String getFormat_Chat(Arena arena, User user, String message);



	public String getFormat_Team_TagPrefix(ArenaTeam team);

	public String getFormat_Team_TagSuffix(ArenaTeam team);

	public String getFormat_Team_PlayerListName(ArenaTeam team, User user);

	public String getFormat_Team_Chat(Arena arena, ArenaTeam team, User user, String message);



	public String getInventory_Teams();

	public String getInventory_Weapons();



	public String[] getSign_List(Arena arena);



	public boolean getGame_HidePlayers();



	public String getScoreboard_DisplayName();

	public long getScoreboard_UpdatePerTicks();

	public String getScoreboard_TeamFormat(ChatColor teamColor, ArenaTeam team, String percent);

	public String[] getScoreboard_List();

}
