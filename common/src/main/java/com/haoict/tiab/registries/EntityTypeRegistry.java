package com.haoict.tiab.registries;

import com.haoict.tiab.config.Constants;
import com.haoict.tiab.entities.TimeAcceleratorEntity;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class EntityTypeRegistry {
    public static final DeferredRegister<EntityType<?>> TILE_ENTITIES = DeferredRegister.create(Constants.MOD_ID, Registries.ENTITY_TYPE);

    public static RegistrySupplier<EntityType<TimeAcceleratorEntity>> timeAcceleratorEntityType =
      TILE_ENTITIES.register("time_accelerator_entity_type", () -> EntityType.Builder.<TimeAcceleratorEntity>of(TimeAcceleratorEntity::new, MobCategory.MISC)
                    .sized(0.1F, 0.1F)
                    .build(new ResourceLocation(Constants.MOD_ID, "time_accelerator_entity_type").toString()));
}
