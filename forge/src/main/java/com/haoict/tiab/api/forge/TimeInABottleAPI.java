package com.haoict.tiab.api.forge;

import com.haoict.tiab.forge.registry.ItemRegistryForge;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class TimeInABottleAPI {
  public static Supplier<Item> getRegistryItem(){
    return ItemRegistryForge.timeInABottleItem;
  }
}