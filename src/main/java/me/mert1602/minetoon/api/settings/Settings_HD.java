package me.mert1602.minetoon.api.settings;

import me.mert1602.advancedapi.setting.ISettingManager;
import me.mert1602.minetoon.api.IMineToon;
import me.mert1602.minetoon.api.hd.HD;

public interface Settings_HD extends ISettingManager<IMineToon> {

	public String getMessage_Created(HD hd);

	public String getMessage_Deleted(int hdID);

	public String getMessage_ModeSet(HD hd);

	public String getMessage_AlreadyExists(HD hd);

	public String getMessage_NotExists(int hdID);

	public String getMessage_CannotSetUserMode(HD hd);

	public String getMessage_HDList();



	public long getUpdatePerTicks();

}
