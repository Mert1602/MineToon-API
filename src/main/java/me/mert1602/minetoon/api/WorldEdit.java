package me.mert1602.minetoon.api;

import com.sk89q.worldedit.bukkit.selections.Selection;

import me.mert1602.advancedapi.ContentInterface;
import me.mert1602.minetoon.api.user.User;

public interface WorldEdit extends ContentInterface<IMineToon> {

	public boolean hasWorldEdit();

	public Selection getSelection(User user);

}
