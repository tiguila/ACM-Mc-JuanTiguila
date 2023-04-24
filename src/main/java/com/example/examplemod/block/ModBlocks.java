package com.example.examplemod.block;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.level.block.SoundType;
import com.example.examplemod.backpack.BackpackBlock;
import com.example.examplemod.item.ModCreativeModTab;
import com.example.examplemod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    public static final RegistryObject<Block> ACM_BLOCK = registerBlock("acm_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops()), ModCreativeModTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> ACM_ORE = registerBlock("acm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModTab.TUTORIAL_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ACM_ORE = registerBlock("deepslate_acm_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModTab.TUTORIAL_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // register cigarette item start
    public static final RegistryObject<Block> CIGGAR = registerBlock("cigarette",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1)), ModCreativeModTab.TUTORIAL_TAB);
    // register cigarette item end



    // register Apple item start
    public static final RegistryObject<Block> APPLE = registerBlock("apple",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2)), ModCreativeModTab.TUTORIAL_TAB);
    // register Apple item end


    //     BACKPACK_BLOCK registry object start

    //     BACKPACK_BLOCK registry object end


}
