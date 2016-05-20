package me.mert1602.minetoon.api.arena.game;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.minetoon.api.user.User;

public interface ArenaGameInventoryUpdater extends ContentInterface<ArenaGame>, Runnable {

	public void updateInventory(User user);

	public void reformInventory(User user);

	public void reformInventory(User user, ArenaGameStatus status);

}
