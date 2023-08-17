package net.silentseekers14.isekaimod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ISEKAI_ARMOR_TAB = new CreativeModeTab("isekai_armor_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MAGISTEEL_HELMET.get());
        }
    };
}