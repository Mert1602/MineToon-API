package me.mert1602.minetoon.api.igs;

import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Removeable;
import me.mert1602.minetoon.api.user.User;

public interface IGS extends ContentInterface<IGSManager>, Listener, Removeable {

	public String getName();

	public boolean isListener();



	public boolean hasPermission();

	public String getPermission();



	public ItemStack getItemStack(User user);



	public void onInteract(User user, Action action);

	public void onClick(User user, ClickType clickType);

}
