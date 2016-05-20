package me.mert1602.minetoon.api.event.user;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.user.User;

public final class MineToonUserRemoveEvent extends MineToonUserEvent {

	public MineToonUserRemoveEvent(IMineToon mineToon, User user) {
		super(mineToon, user);
	}

}
