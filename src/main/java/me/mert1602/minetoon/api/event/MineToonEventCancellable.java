package me.mert1602.minetoon.api.event;

import org.bukkit.event.Cancellable;

import lombok.Getter;
import lombok.Setter;
import me.mert1602.minetoon.api.IMineToon;

public class MineToonEventCancellable extends MineToonEvent implements Cancellable {

	@Getter @Setter private boolean cancelled;

	public MineToonEventCancellable(IMineToon mineToon) {
		super(mineToon);

		this.cancelled = false;

	}

}
