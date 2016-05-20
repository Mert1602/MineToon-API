package me.mert1602.minetoon.api.event.user;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.event.offlineuser.MineToonUserOfflineEvent;
import me.mert1602.minetoon.api.user.User;

class MineToonUserEvent extends MineToonUserOfflineEvent {

	@Getter private final User user;

	public MineToonUserEvent(IMineToon mineToon, User user) {
		super(mineToon, user);

		this.user = user;

	}

}
