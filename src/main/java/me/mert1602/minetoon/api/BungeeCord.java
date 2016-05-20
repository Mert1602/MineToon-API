package me.mert1602.minetoon.api;

import org.bukkit.plugin.messaging.PluginMessageListener;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.minetoon.api.user.User;

public interface BungeeCord extends ContentInterface<IMineToon>, PluginMessageListener {

	public void sendTo(User user, String server);

}
