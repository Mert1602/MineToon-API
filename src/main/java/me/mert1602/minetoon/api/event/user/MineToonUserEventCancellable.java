package me.mert1602.minetoon.api.event.user;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.event.offlineuser.MineToonUserOfflineEventCancellable;
import me.mert1602.minetoon.api.user.User;

class MineToonUserEventCancellable extends MineToonUserOfflineEventCancellable {

	@Getter private final User user;

	public MineToonUserEventCancellable(IMineToon mineToon, User user) {
		super(mineToon, user);

		this.user = user;

	}

}
