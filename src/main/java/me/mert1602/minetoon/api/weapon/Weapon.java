package me.mert1602.minetoon.api.weapon;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Deleteable;
import me.mert1602.advancedapi.Removeable;
import me.mert1602.advancedapi.Renameable;

public interface Weapon extends ContentInterface<WeaponManager>, Renameable, Removeable, Deleteable {

	public String getName();

	public WeaponSettings getSettings();

}
