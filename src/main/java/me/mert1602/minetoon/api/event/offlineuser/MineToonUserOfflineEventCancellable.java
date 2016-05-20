package me.mert1602.minetoon.api.event.offlineuser;

import lombok.Getter;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.event.MineToonEventCancellable;
import me.mert1602.minetoon.api.user.UserManager;
import me.mert1602.minetoon.api.user.UserOffline;

public class MineToonUserOfflineEventCancellable extends MineToonEventCancellable {

	@Getter private final UserOffline offlineUser;
	@Getter private final UserManager userManager;

	public MineToonUserOfflineEventCancellable(IMineToon mineToon, UserOffline offlineUser) {
		super(mineToon);

		this.offlineUser = offlineUser;
		this.userManager = this.offlineUser.getContent();

	}

}
