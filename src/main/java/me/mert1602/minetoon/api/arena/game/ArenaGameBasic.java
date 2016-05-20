package me.mert1602.minetoon.api.arena.game;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Removeable;
import me.mert1602.minetoon.api.arena.Arena;

public interface ArenaGameBasic extends ContentInterface<Arena>, Removeable {

	public ArenaGameStatus getStatus();

	public boolean isJoinable();

	public boolean isBlockChanged();



	public void setStatus(ArenaGameStatus status);

	public void setJoinable(boolean value);

	public void setBlockChanged(boolean value);


}
