package me.mert1602.minetoon.api;

import lombok.Getter;
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

public final class MineToon {

	private MineToon() {}

	@Getter private static IMineToon instance;

	public static void setInstance(IMineToon instance){

		if(MineToon.instance != null) return;

		MineToon.instance = instance;

	}



	public static Settings getSettings() {
		return instance.getSettings();
	}

	public static Settings_Items getSettings_Items() {
		return instance.getSettings_Items();
	}

	public static Settings_HD getSettings_HD(){
		return instance.getSettings_HD();
	}

	public static Settings_Messages getSettings_Messages() {
		return instance.getSettings_Messages();
	}

	public static Settings_Messages_Arena getSettings_Messages_Arena() {
		return instance.getSettings_Messages_Arena();
	}

	public static Settings_Messages_Game getSettings_Messages_Game() {
		return instance.getSettings_Messages_Game();
	}

	public static Settings_Messages_Stats getSettings_Messages_Stats() {
		return instance.getSettings_Messages_Stats();
	}

	public static Settings_Messages_Team getSettings_Messages_Team() {
		return instance.getSettings_Messages_Team();
	}

	public static Settings_Messages_Weapon getSettings_Messages_Weapon() {
		return instance.getSettings_Messages_Weapon();
	}



	public static UserManager getUserManager(){
		return instance.getUserManager();
	}

	public static ArenaManager getArenaManager(){
		return instance.getArenaManager();
	}

	public static SignManager getSignManager(){
		return instance.getSignManager();
	}

	public static WeaponManager getWeaponManager(){
		return instance.getWeaponManager();
	}

	public static IGSManager getIGSManager(){
		return instance.getIGSManager();
	}

	public static HDManager getHDManager(){
		return instance.getHDManager();
	}



	public static ServerVersion getServerVersion(){
		return instance.getServerVersion();
	}

	public static WorldEdit getWorldEdit(){
		return instance.getWorldEdit();
	}

	public static BungeeCord getBungeeCord(){
		return instance.getBungeeCord();
	}

	public static ProtocolLib getProtocolLib(){
		return instance.getProtocolLib();
	}

	public static Vault getVault(){
		return instance.getVault();
	}

	public static CrackShot getCrackShot(){
		return instance.getCrackShot();
	}

	public static HolographicDisplays getHolographicDisplays(){
		return instance.getHolographicDisplays();
	}

}
