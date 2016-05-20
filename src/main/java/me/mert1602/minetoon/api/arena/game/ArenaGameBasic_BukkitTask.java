package me.mert1602.minetoon.api.arena.game;

import org.bukkit.scheduler.BukkitTask;

public interface ArenaGameBasic_BukkitTask extends ArenaGameBasic_List {

	public BukkitTask getCountdownBukkitTask();

	public BukkitTask getScoreboardUpdaterBukkitTask();

	public BukkitTask getInventoryUpdaterBukkitTask();

	public BukkitTask getHideUpdaterBukkitTask();



	public void setCountdownBukkitTask(BukkitTask bukkitTask);

	public void setScoreboardUpdaterBukkitTask(BukkitTask bukkitTask);

	public void setInventoryUpdaterBukkitTask(BukkitTask bukkitTask);

	public void setHideUpdaterBukkitTask(BukkitTask bukkitTask);

}
