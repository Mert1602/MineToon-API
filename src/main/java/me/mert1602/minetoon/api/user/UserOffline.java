package me.mert1602.minetoon.api.user;

import java.util.UUID;

import org.bukkit.OfflinePlayer;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Deleteable;
import me.mert1602.advancedapi.Removeable;

public interface UserOffline extends ContentInterface<UserManager>, Removeable, Deleteable {

	public UUID getUUID();

	public UserOfflineSettings getSettings();

	public OfflinePlayer getBukkitOfflinePlayer();

}
