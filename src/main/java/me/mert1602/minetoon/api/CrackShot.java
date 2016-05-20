package me.mert1602.minetoon.api;

import org.bukkit.inventory.ItemStack;

import me.mert1602.advancedapi.ContentInterface;

public interface CrackShot extends ContentInterface<IMineToon> {

	public boolean hasCrackShot();

	public ItemStack generateWeapon(String name);

	public boolean containsWeapon(String name);

}
