package com.gildedgames.aether.common.item.tools.holystone;

import com.gildedgames.aether.common.item.tools.abilities.IHolystoneToolItem;
import com.gildedgames.aether.common.registry.AetherItemGroups;
import com.gildedgames.aether.common.registry.AetherItemTiers;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class HolystoneAxeItem extends AxeItem implements IHolystoneToolItem
{
	public HolystoneAxeItem() {
		super(AetherItemTiers.HOLYSTONE, 7.0F, -3.2F, new Item.Properties().tab(AetherItemGroups.AETHER_TOOLS));
	}

	@Override
	public boolean mineBlock(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
		spawnAmbrosiumDrops(worldIn, pos);
		return super.mineBlock(stack, worldIn, state, pos, entityLiving);
	}
}
