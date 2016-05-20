package me.mert1602.minetoon.api;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.hd.HD;

public interface HolographicDisplays extends ContentInterface<IMineToon>, Reloadable, Stopable {

	public boolean hasHolographicDisplays();

	public void update(HD hd);

	public void remove(HD hd);

}
