package me.mert1602.minetoon.api.arena.game;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.minetoon.api.user.User;

public interface ArenaGameHideUpdater extends ContentInterface<ArenaGame>, Runnable {

	public void updateUser(User user);

	public void resetUser(User user);

}
