package me.mert1602.minetoon.api;

import me.mert1602.advancedapi.basic.BasicInterface;
import me.mert1602.minetoon.api.arena.ArenaManager;
import me.mert1602.minetoon.api.hd.HDManager;
import me.mert1602.minetoon.api.igs.IGSManager;
import me.mert1602.minetoon.api.settings.Settings;
import me.mert1602.minetoon.api.settings.Settings_HD;
import me.mert1602.minetoon.api.settings.Settings_Items;
import me.mert1602.minetoon.api.settings.Settings_Messages;
import me.mert1602.minetoon.api.settings.Settings_Messages_Arena;
import me.mert1602.minetoon.api.settings.Settings_Messages_Game;
import me.mert1602.minetoon.api.settings.Settings_Messages_Stats;
import me.mert1602.minetoon.api.settings.Settings_Messages_Team;
import me.mert1602.minetoon.api.settings.Settings_Messages_Weapon;
import me.mert1602.minetoon.api.sign.SignManager;
import me.mert1602.minetoon.api.user.UserManager;
import me.mert1602.minetoon.api.weapon.WeaponManager;

public interface IMineToon extends BasicInterface {

	public Settings getSettings();

	public Settings_Items getSettings_Items();

	public Settings_HD getSettings_HD();

	public Settings_Messages getSettings_Messages();

	public Settings_Messages_Arena getSettings_Messages_Arena();

	public Settings_Messages_Game getSettings_Messages_Game();

	public Settings_Messages_Stats getSettings_Messages_Stats();

	public Settings_Messages_Team getSettings_Messages_Team();

	public Settings_Messages_Weapon getSettings_Messages_Weapon();



	public UserManager getUserManager();

	public ArenaManager getArenaManager();

	public SignManager getSignManager();

	public WeaponManager getWeaponManager();

	public IGSManager getIGSManager();

	public HDManager getHDManager();



	public ServerVersion getServerVersion();

	public WorldEdit getWorldEdit();

	public BungeeCord getBungeeCord();

	public ProtocolLib getProtocolLib();

	public Vault getVault();

	public CrackShot getCrackShot();

	public HolographicDisplays getHolographicDisplays();

}
