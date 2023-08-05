package com.haoict.tiab.forge;

import static com.haoict.tiab.forge.registry.ItemRegistryForge.ITEMS;

import com.haoict.tiab.Tiab;
import com.haoict.tiab.commands.TiabCommands;
import com.haoict.tiab.config.Constants;
import com.haoict.tiab.config.TiabConfig;
import dev.architectury.platform.forge.EventBuses;
import net.minecraft.commands.Commands;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class TiabForge {
  public TiabForge() {
    EventBuses.registerModEventBus(Constants.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
    Tiab.init();
    ITEMS.register();
    ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, TiabConfig.COMMON_CONFIG);
  }

  private void clientSetup(final FMLClientSetupEvent event) {
    Tiab.postInit();
  }

  @SubscribeEvent
  public void onServerStarting(ServerStartingEvent event) {
    event.getServer().getCommands().getDispatcher().register(Commands.literal(Constants.MOD_ID).then(TiabCommands.addTimeCommand).then(TiabCommands.removeTimeCommand));
  }
}
