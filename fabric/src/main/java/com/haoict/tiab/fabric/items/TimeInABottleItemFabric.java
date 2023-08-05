package com.haoict.tiab.fabric.items;

import com.haoict.tiab.items.TimeInABottleItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class TimeInABottleItemFabric extends TimeInABottleItem {

  @Override
  public boolean allowNbtUpdateAnimation(final Player player, final InteractionHand hand, final ItemStack oldStack, final ItemStack newStack) {
    return !ItemStack.isSameItem(oldStack, newStack);
  }
}
