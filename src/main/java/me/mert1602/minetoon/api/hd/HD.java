package me.mert1602.minetoon.api.hd;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Deleteable;
import me.mert1602.advancedapi.Removeable;

public interface HD extends ContentInterface<HDManager>, Removeable, Deleteable {

	public int getID();

	public HDSettings getSettings();

	public void update();

}
