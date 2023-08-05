package com.haoict.tiab.fabric;

import com.haoict.tiab.Tiab;
import net.fabricmc.api.ClientModInitializer;

public class TiabClientFabric implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    Tiab.postInit();
  }
}
