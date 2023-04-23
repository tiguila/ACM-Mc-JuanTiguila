package com.example.examplemod.backpack;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ModCreativeModTab;
import com.example.examplemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BackpackBlock extends Block {
    public BackpackBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    public static final RegistryObject<Block> BACKPACK_BLOCK = BLOCKS.register("backpack_block", () -> new BackpackBlock(BlockBehaviour.Properties.of(Material.WOOD)
            .strength(2.0F)
            .sound(SoundType.WOOD)
            .lightLevel((state) -> 14)));

    public static final RegistryObject<Item> BACKPACK_ITEM = ITEMS.register("backpack_block", () -> new BlockItem(BACKPACK_BLOCK.get(), new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
