//package com.example.examplemod.backpack;
//
//
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.item.DyeColor;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.item.Items;
//import net.minecraft.world.item.context.UseOnContext;
//import net.minecraft.world.level.Level;
//import com.example.examplemod.item.ModCreativeModTab;
//
//public class BackpackItem extends Item {
//
//    private static final int INVENTORY_SIZE = 27;
//
//    public BackpackItem() {
//        super(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB));
//    }
//
//    @Override
//    public ItemStack use(Level level, Player player, UseOnContext context) {
//        if (!level.isClientSide()) {
//            // Get the player's inventory
//            Inventory inventory = player.getInventory();
//            // Check if the player is sneaking
//            if (player.isShiftKeyDown()) {
//                // Open the backpack GUI
//                player.openMenu(new BackpackContainerProvider());
//            } else {
//                // Get the itemstack that the player is holding
//                ItemStack heldItem = player.getItemInHand(context.getHand());
//                // Check if the held item is a backpack
//                if (heldItem.getItem() instanceof BackpackItem) {
//                    // Get the color of the backpack
//                    DyeColor color = BackpackUtils.getColor(heldItem);
//                    // Loop through the player's inventory
//                    for (int i = 0; i < inventory.getContainerSize(); i++) {
//                        // Get the ItemStack at this slot
//                        ItemStack itemStack = inventory.getItem(i);
//                        // Check if the ItemStack is not empty
//                        if (!itemStack.isEmpty()) {
//                            // Get the Item from the ItemStack
//                            Item item = itemStack.getItem();
//                            // Check if the Item can be stored in the backpack
//                            if (BackpackUtils.canItemFitInBackpack(item, color)) {
//                                // Try to add the ItemStack to the backpack
//                                if (addStackToInventory(heldItem, itemStack, player)) {
//                                    // Remove the ItemStack from the player's inventory
//                                    inventory.removeItem(i, itemStack.getCount());
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return super.use(level, player, context);
//    }
//
//    private boolean addStackToInventory(ItemStack backpackStack, ItemStack itemStack, Player player) {
//        // Check if the backpack has room for the item
//        if (getFreeInventorySpace(backpackStack) < itemStack.getCount()) {
//            return false;
//        }
//        // Get the backpack's inventory
//        BackpackInventory backpackInventory = new BackpackInventory(backpackStack);
//        // Try to add the item to the inventory
//        ItemStack remaining = backpackInventory.addItem(itemStack);
//        // If there is any remaining item, drop it on the ground
//        if (!remaining.isEmpty()) {
//            player.drop(remaining, false);
//        }
//        return true;
//    }
//
//    public static int getFreeInventorySpace(ItemStack backpackStack) {
//        BackpackInventory backpackInventory = new BackpackInventory(backpackStack);
//        int freeSlots = 0;
//        for (int i = 0; i < backpackInventory.getContainerSize(); i++) {
//            if (backpackInventory.getItem(i).isEmpty()) {
//                freeSlots++;
//            }
//        }
//        return freeSlots;
//    }
//}
