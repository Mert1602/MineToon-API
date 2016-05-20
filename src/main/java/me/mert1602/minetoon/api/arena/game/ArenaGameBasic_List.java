package me.mert1602.minetoon.api.arena.game;

import java.util.HashMap;
import java.util.List;

import me.mert1602.minetoon.api.user.User;
import me.mert1602.minetoon.api.weapon.Weapon;

public interface ArenaGameBasic_List extends ArenaGameBasic {

	public List<User> getUserList();

	public List<User> getMFAUserList();

	public List<User> getSpectatorList();

	public List<User> getMFASpectatorList();

	public List<User> getIngameUserList();

	public HashMap<User, Weapon> getWeaponMap();

}
