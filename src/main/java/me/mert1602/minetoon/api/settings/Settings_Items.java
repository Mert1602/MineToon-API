package me.mert1602.minetoon.api.settings;

import org.bukkit.inventory.ItemStack;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;

public interface Settings_Items extends ISettingManager<IMineToon> {

	public ItemStack getGame_Weapons_Item();

	public int getGame_Weapons_Slot();

	public ItemStack getGame_Leave_Item();

	public int getGame_Leave_Slot();

	public ItemStack getGame_Teams_Item();

	public int getGame_Teams_Slot();

	public int getGame_IngameWeapon_Slot();



	public ItemStack getAIGUI_Page_Item();

	public ItemStack getAIGUI_Next_Item();

	public ItemStack getAIGUI_Preview_Item();

}
