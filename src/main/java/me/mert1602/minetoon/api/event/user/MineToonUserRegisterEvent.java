package me.mert1602.minetoon.api.event.user;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.user.User;

public final class MineToonUserRegisterEvent extends MineToonUserEventCancellable {

	public MineToonUserRegisterEvent(IMineToon mineToon, User user) {
		super(mineToon, user);
	}

}
