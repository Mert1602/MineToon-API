package me.mert1602.minetoon.api;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.minetoon.api.user.User;

public interface Vault extends ContentInterface<IMineToon> {

	public boolean hasEconomy();

	public boolean hasMoney(User user, double amount);

	public void giveMoney(User user, double amount);

	public void removeMoney(User user, double amount);

}
