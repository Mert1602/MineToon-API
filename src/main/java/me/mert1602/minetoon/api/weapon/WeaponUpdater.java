package me.mert1602.minetoon.api.weapon;

import org.bukkit.entity.Entity;

import me.mert1602.advancedapi.ContentInterface;

public interface WeaponUpdater extends ContentInterface<WeaponManager>, Runnable {

	public void track(Entity entity);

}
