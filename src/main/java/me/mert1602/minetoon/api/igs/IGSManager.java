package me.mert1602.minetoon.api.igs;

import me.mert1602.advancedapi.basic.ContentManager;
import me.mert1602.advancedapi.basic.Loadable;
import me.mert1602.advancedapi.basic.Reloadable;
import me.mert1602.advancedapi.basic.Startable;
import me.mert1602.advancedapi.basic.Stopable;
import me.mert1602.minetoon.api.IMineToon;

public interface IGSManager extends ContentManager<IGS, IMineToon>, Loadable, Startable, Reloadable, Stopable {

	public IGS getIGS(String name);

	public IGS addIGS(IGS igs);

	public void addDefault();

}
