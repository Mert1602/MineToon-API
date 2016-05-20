package me.mert1602.minetoon.api.settings;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.weapon.Weapon;

public interface Settings_Messages_Weapon extends ISettingManager<IMineToon> {

	public String getCreated(Weapon weapon);

	public String getDeleted(String weaponName);

	public String getAlreadyExists(Weapon weapon);

	public String getNotExists(String weaponName);

	public String getRenamed(String oldWeaponName, Weapon newWeapon);

	public String getCouldNotRename(Weapon weapon);

	public String getCrackShotWeaponSet(Weapon weapon);

	public String getCrackShotWeaponNotExists(Weapon weapon, String crackshot);

	public String getWeaponList();

	public String getNotEnoughMoney();

	public String getBought(Weapon weapon);

	public String getSelected(Weapon weapon);

}
