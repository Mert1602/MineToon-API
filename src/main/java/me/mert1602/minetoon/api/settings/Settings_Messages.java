package me.mert1602.minetoon.api.settings;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;

public interface Settings_Messages extends ISettingManager<IMineToon> {

	public String getNoPermission();



	public String getCommand_OnlyForPlayers();

	public String getCommand_WrongUsage(String commandUsage);

	public String getCommand_NoValidBlockInHand();

	public String getCommand_NeedWESelection();

	public String getCommand_MineToonReloaded();

	public String getCommand_Version();

	public String getCommand_SubCommandDontExists();



	public String getCommand_Unknown_Number(String number);

	public String getCommand_Unknown_ChatColor(String chatcolor);

	public String getCommand_Unknown_Player(String player);

	public String getCommand_Unknown_HDMode(String hdMode);



	public String getSign_Created();

}
