package com.haoict.tiab.forge.registry;

import com.haoict.tiab.config.Constants;
import com.haoict.tiab.forge.items.TimeInABottleItemForge;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ItemRegistryForge {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Constants.MOD_ID, Registries.ITEM);
  public static final RegistrySupplier<Item> timeInABottleItem = ITEMS.register("time_in_a_bottle", TimeInABottleItemForge::new);
}
