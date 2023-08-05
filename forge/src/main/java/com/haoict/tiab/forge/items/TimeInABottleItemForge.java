package com.haoict.tiab.forge.items;

 import com.haoict.tiab.items.TimeInABottleItem;
 import net.minecraft.world.item.ItemStack;

public class TimeInABottleItemForge extends TimeInABottleItem {

  @Override
  public boolean shouldCauseReequipAnimation(final ItemStack oldStack, final ItemStack newStack, final boolean slotChanged) {
    return !ItemStack.isSameItem(oldStack, newStack);
  }
}
