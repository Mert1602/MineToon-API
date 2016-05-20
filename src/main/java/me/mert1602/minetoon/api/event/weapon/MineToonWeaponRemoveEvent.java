package me.mert1602.minetoon.api.event.weapon;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.weapon.Weapon;

public final class MineToonWeaponRemoveEvent extends MineToonWeaponEvent {

	public MineToonWeaponRemoveEvent(IMineToon mineToon, Weapon weapon) {
		super(mineToon, weapon);
	}

}
