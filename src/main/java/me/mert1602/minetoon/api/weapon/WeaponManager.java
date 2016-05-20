package me.mert1602.minetoon.api.weapon;

import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.advancedapi.basic.Loadable;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Startable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.IMineToon;

public interface WeaponManager extends ContentManager<Weapon, IMineToon>, Loadable, Startable, Reloadable, Stopable {

	public Weapon getWeapon(String name);

	public Weapon addWeapon(String name);

	public void addDefault();

	public void addFolder();

}
