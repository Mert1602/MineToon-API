package me.mert1602.minetoon.api;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Fish;
import org.bukkit.entity.LargeFireball;
import org.bukkit.entity.Projectile;
import org.bukkit.entity.SmallFireball;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.ThrownExpBottle;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.entity.WitherSkull;

public enum ProjectileType {

	SNOWBALL(Snowball.class),
	EGG(Egg.class),
	ENDERPEARL(EnderPearl.class),
	ARROW(Arrow.class),
	POTION(ThrownPotion.class),
	EXPBOTTLE(ThrownExpBottle.class),
	FISH(Fish.class),
	FIREBALL(Fireball.class),
	LARGEFIREBALL(LargeFireball.class),
	SMALLFIREBALL(SmallFireball.class),
	WITHERSKULL(WitherSkull.class);

	private Class<? extends Projectile> clazz;

	private ProjectileType(Class<? extends Projectile> clazz) {
		this.clazz = clazz;
	}

	public Class<? extends Projectile> getProjectileClass(){
		return this.clazz;
	}

}
