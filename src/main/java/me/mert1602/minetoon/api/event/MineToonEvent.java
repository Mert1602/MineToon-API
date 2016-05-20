package me.mert1602.minetoon.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;

public class MineToonEvent extends Event {

	private static final HandlerList handlers = new HandlerList();

	@Getter private final IMineToon mineToon;

	public MineToonEvent(IMineToon mineToon) {

		this.mineToon = mineToon;

	}

	@Override
	public HandlerList getHandlers() {
		return MineToonEvent.handlers;
	}

	public static HandlerList getHandlerList() {
		return MineToonEvent.handlers;
	}

}