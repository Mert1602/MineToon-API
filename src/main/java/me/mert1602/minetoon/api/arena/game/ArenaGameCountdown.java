package me.mert1602.minetoon.api.arena.game;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Removeable;

public interface ArenaGameCountdown extends ContentInterface<ArenaGame>, Runnable, Removeable {

	public int getTimer_Lobby();

	public int getTimer_Circle();

	public int getTimer_Ingame();

	public int getTimer_End();



	public void setTimer_Lobby(int value);

	public void setTimer_Circle(int value);

	public void setTimer_Ingame(int value);

	public void setTimer_End(int value);



	public void reloadTimer();

}
