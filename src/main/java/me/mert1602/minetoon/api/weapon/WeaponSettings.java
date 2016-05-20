package me.mert1602.minetoon.api.weapon;

import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.advancedapi.setting.type.SettingBoolean;
import me.mert1602.advancedapi.setting.type.SettingString;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.ProjectileType;
import me.mert1602.minetoon.api.user.User;

public interface WeaponSettings extends ISettingManager<IMineToon> {

	public String getPermission_Name();

	public boolean isPermission_Enabled();



	public SettingBoolean isCrackShot_Enabled();

	public SettingString getCrackShot_Weapon_Name();



	public int getPrice_Amount();

	public String[] getPrice_Lore();



	public ItemStack getItem(User user);



	public ProjectileType getProjectile_Type();

	public int getProjectile_Amount();

	public double getProjectile_Damage();

	public double getProjectile_Speed();

	public double getProjectile_Spread();



	public long getDelay_BetweenShots();

	public long getDelay_DespawnTime();



	public Sound getSound_Name();

	public float getSound_Volume();

	public float getSound_Pitch();

}
