package com.haoict.tiab.api;

import java.util.function.Supplier;

import com.haoict.tiab.config.Constants;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.Item;
import org.apache.commons.lang3.NotImplementedException;

/**
  * Used to get The Registry Object for TIAB without needing to try to get it
  * This is for mods wanting it without worrying about anything changing
 *  And for anything useful mods may need.
 */
public class TimeInABottleAPI {

    @ExpectPlatform
    public static Supplier<Item> getRegistryItem() {
        throw new NotImplementedException();
    }

    public static String getModID() {
        return Constants.MOD_ID;
    }
}
