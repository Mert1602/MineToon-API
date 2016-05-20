package me.mert1602.minetoon.api.event.offlineuser;

import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.user.UserOffline;

public final class MineToonUserOfflineRemoveEvent extends MineToonUserOfflineEvent {

	public MineToonUserOfflineRemoveEvent(IMineToon mineToon, UserOffline offlineUser) {
		super(mineToon, offlineUser);
	}

}
