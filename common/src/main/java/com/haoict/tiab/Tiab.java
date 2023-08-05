package com.haoict.tiab;

import static com.haoict.tiab.registries.EntityTypeRegistry.TILE_ENTITIES;
import static com.haoict.tiab.registries.EntityTypeRegistry.timeAcceleratorEntityType;

import com.haoict.tiab.client.renderer.TimeAcceleratorEntityRenderer;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;

public class Tiab {
  public static void init() {
    TILE_ENTITIES.register();
  }

  public static void postInit() {
    EntityRendererRegistry.register(timeAcceleratorEntityType, TimeAcceleratorEntityRenderer::new);
  }
}
