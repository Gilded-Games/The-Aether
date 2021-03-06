package com.gildedgames.aether.common.inventory.container.slot;

import com.gildedgames.aether.common.inventory.container.IncubatorContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;

public class IncubatorEggSlot extends Slot {
	private final IncubatorContainer container;
	private PlayerEntity player;
	
	public IncubatorEggSlot(IncubatorContainer container, IInventory incubatorInventoryIn, int index, int xPosition, int yPosition, PlayerEntity playerIn) {
		super(incubatorInventoryIn, index, xPosition, yPosition);
		this.container = container;
		this.player = playerIn;
	}
	
	@Override
	public int getMaxStackSize() {
		return 1;
	}
	
	@Override
	public boolean mayPlace(ItemStack stack) {
		return container.isEgg(stack);
	}
	
	@Override
	public void set(ItemStack stack) {
		super.set(stack);
		container.playerUUIDAcceptor.accept(player.getUUID());
	}

}
