package com.haoict.tiab.api.fabric;

import com.haoict.tiab.fabric.registry.ItemRegistryFabric;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class TimeInABottleAPI {
  public static Supplier<Item> getRegistryItem(){
    return ItemRegistryFabric.timeInABottleItem;
  }
}
