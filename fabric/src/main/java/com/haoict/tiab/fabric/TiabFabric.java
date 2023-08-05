package com.haoict.tiab.fabric;

import com.haoict.tiab.Tiab;
import com.haoict.tiab.config.Constants;
import com.haoict.tiab.config.TiabConfig;
import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;

import static com.haoict.tiab.fabric.registry.ItemRegistryFabric.ITEMS;

public class TiabFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Tiab.init();
        ITEMS.register();
        ForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.COMMON, TiabConfig.COMMON_CONFIG);
    }
}
