package me.mert1602.minetoon.api.event.weapon;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.weapon.Weapon;

public final class MineToonWeaponDeleteEvent extends MineToonWeaponEvent {

	public MineToonWeaponDeleteEvent(IMineToon mineToon, Weapon weapon) {
		super(mineToon, weapon);
	}

}
