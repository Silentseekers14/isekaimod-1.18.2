package net.silentseekers14.isekaimod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier MAGISTEEL = new ForgeTier(4, 2031, 8f,
            4f, 19, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.MAGISTEEL_INGOT.get()));

        public static final ForgeTier CURSED = new ForgeTier(4, 4062, 9f,
                5f, 16, BlockTags.NEEDS_DIAMOND_TOOL,
                () -> Ingredient.of(ModItems.CURSED_INGOT.get()));

        public static final ForgeTier MITHRIL = new ForgeTier(4, 4062, 9f,
                5f, 16, BlockTags.NEEDS_DIAMOND_TOOL,
                () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));

    public static final ForgeTier ADAMANT = new ForgeTier(4, 8128, 10f,
            6f, 17, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ADAMANT_INGOT.get()));

    public static final ForgeTier ORICHALCUM = new ForgeTier(4, 8128, 10f,
            6f, 17, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get()));

    public static final ForgeTier SCARLET = new ForgeTier(4, 16256, 11f,
            7f, 18, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.SCARLET_INGOT.get()));

    public static final ForgeTier DRAGON = new ForgeTier(4, 32512, 12f,
            8f, 19, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.DRAGON_INGOT.get()));
}
