package me.mert1602.minetoon.api.event.weapon;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.event.MineToonEvent;
import me.mert1602.minetoon.api.weapon.Weapon;
import me.mert1602.minetoon.api.weapon.WeaponManager;

class MineToonWeaponEvent extends MineToonEvent {

	@Getter private final Weapon weapon;
	@Getter private final WeaponManager weaponManager;

	public MineToonWeaponEvent(IMineToon mineToon, Weapon weapon) {
		super(mineToon);

		this.weapon = weapon;
		this.weaponManager = this.weapon.getContent();

	}

}
