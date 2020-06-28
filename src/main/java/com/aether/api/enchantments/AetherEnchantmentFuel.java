package com.aether.api.enchantments;

import javax.annotation.Nonnull;

import com.aether.api.internal.AbstractAetherSmeltingFuel;

import net.minecraft.item.Item;

public class AetherEnchantmentFuel extends AbstractAetherSmeltingFuel<AetherEnchantmentFuel> {

	public AetherEnchantmentFuel(@Nonnull Item fuelItem, int timeGiven) {
		super(fuelItem, timeGiven);
	}
	
	@Override
	protected boolean canEqual(Object obj) {
		return obj instanceof AetherEnchantmentFuel;
	}
	
}