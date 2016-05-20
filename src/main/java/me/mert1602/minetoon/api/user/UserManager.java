package me.mert1602.minetoon.api.user;

import java.util.List;

import org.bukkit.entity.Player;

import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.advancedapi.basic.Loadable;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Startable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.IMineToon;

public interface UserManager extends ContentManager<User, IMineToon>, Loadable, Startable, Reloadable, Stopable {

	public List<UserOffline> getOfflineList();

	public User getUser(Player bukkitPlayer);

	public UserOffline getOfflineUser(String name);

	public User addUser(Player bukkitPlayer);



	public void addFolder();

}
