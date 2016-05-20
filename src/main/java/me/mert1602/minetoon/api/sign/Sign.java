package me.mert1602.minetoon.api.sign;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.Deleteable;
import me.mert1602.advancedapi.Removeable;

public interface Sign extends ContentInterface<SignManager>, Removeable, Deleteable {

	public String getID();

	public SignSettings getSettings();

	public void update();

}
