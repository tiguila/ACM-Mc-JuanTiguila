//package com.example.examplemod.entity;
//
//
//
//
//import com.example.examplemod.ExampleMod;
//import com.example.examplemod.entity.custom.ChomperEntity;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.entity.EntityType;
//import net.minecraft.world.entity.MobCategory;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.RegistryObject;
//
//public class ModEntityTypes {
//    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
//            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MOD_ID);
//    public static final RegistryObject<EntityType<ChomperEntity>> CHOMPER =
//            ENTITY_TYPES.register("chomper",
//                    () -> EntityType.Builder.of(ChomperEntity::new, MobCategory.MONSTER)
//                            .sized(0.4f, 1.5f)
//                            .build(new ResourceLocation(ExampleMod.MOD_ID, "chomper").toString()));
//
//
//    public static void register(IEventBus eventBus) {
//        ENTITY_TYPES.register(eventBus);
//    }
//}



package com.example.examplemod.entity;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entity.custom.ChomperEntity;
import com.example.examplemod.entity.BackpackEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MOD_ID);

    public static final RegistryObject<EntityType<ChomperEntity>> CHOMPER =
            ENTITY_TYPES.register("chomper",
                    () -> EntityType.Builder.of(ChomperEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(ExampleMod.MOD_ID, "chomper").toString()));

    public static final RegistryObject<EntityType<BackpackEntity>> BACKPACK =
            ENTITY_TYPES.register("ceobackpack",
                    () -> EntityType.Builder.of(BackpackEntity::new, MobCategory.MISC)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(ExampleMod.MOD_ID, "ceobackpack").toString()));



// new added - start
    public static final RegistryObject<EntityType<CigarEntity>> cigarette =
            ENTITY_TYPES.register("cigarette",
                    () -> EntityType.Builder.of(CigarEntity::new, MobCategory.MISC)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(ExampleMod.MOD_ID, "cigarette").toString()));
    // new added - end

    public static final RegistryObject<EntityType<CompanionEntity>> Companion =
            ENTITY_TYPES.register("companion",
                    () -> EntityType.Builder.of(CompanionEntity::new, MobCategory.MISC)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(ExampleMod.MOD_ID, "companion").toString()));




    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}


//public class ModEntityTypes {
//    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
//            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ExampleMod.MOD_ID);
//
//    public static final RegistryObject<EntityType<ChomperEntity>> CHOMPER =
//            ENTITY_TYPES.register("chomper",
//                    () -> EntityType.Builder.of(ChomperEntity::new, MobCategory.MONSTER)
//                            .sized(0.4f, 1.5f)
//                            .build(new ResourceLocation(ExampleMod.MOD_ID, "chomper").toString()));
//
//    public static final RegistryObject<EntityType<BackpackEntity>> BACKPACK =
//            ENTITY_TYPES.register("backpack",
//                    () -> EntityType.Builder.of(BackpackEntity::new, MobCategory.MISC)
//                            .sized(0.25f, 0.25f)
//                            .build(new ResourceLocation(ExampleMod.MOD_ID, "backpack").toString()));
//
//    public static final RegistryObject<EntityType<CigarEntity>> CIGAR =
//            ENTITY_TYPES.register("cigarette",
//                    () -> EntityType.Builder.of(CigarEntity::new, MobCategory.MISC)
//                            .sized(0.2f, 0.2f)
//                            .build(new ResourceLocation(ExampleMod.MOD_ID, "cigarette").toString()));
//
//    public static void register(IEventBus eventBus) {
//        ENTITY_TYPES.register(eventBus);
//    }
//}
