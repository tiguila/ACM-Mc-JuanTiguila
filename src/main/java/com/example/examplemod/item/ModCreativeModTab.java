package com.example.examplemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("tutorialtab") {

        // original
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ACMIUM.get());
        }




        // modified
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModItems.BACKPACK.get());
//        }



    };


}
