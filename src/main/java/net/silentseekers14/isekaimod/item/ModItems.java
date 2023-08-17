package net.silentseekers14.isekaimod.item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.silentseekers14.isekaimod.IsekaiMod;
import net.silentseekers14.isekaimod.item.custom.*;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IsekaiMod.MOD_ID);

    public static final RegistryObject<Item> MAGISTEEL_INGOT = ITEMS.register("magisteel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> CURSED_INGOT = ITEMS.register("cursed_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> SCARLET_INGOT = ITEMS.register("scarlet_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> DRAGON_INGOT = ITEMS.register("dragon_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> MAGISTEEL_SWORD = ITEMS.register("magisteel_sword",
            () -> new SwordItem(ModTiers.MAGISTEEL, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MAGISTEEL_PICKAXE = ITEMS.register("magisteel_pickaxe",
            () -> new PickaxeItem(ModTiers.MAGISTEEL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGISTEEL_AXE = ITEMS.register("magisteel_axe",
            () -> new AxeItem(ModTiers.MAGISTEEL, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGISTEEL_SHOVEL = ITEMS.register("magisteel_shovel",
            () -> new ShovelItem(ModTiers.MAGISTEEL, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGISTEEL_HOE = ITEMS.register("magisteel_hoe",
            () -> new HoeItem(ModTiers.MAGISTEEL, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MAGISTEEL_HELMET = ITEMS.register("magisteel_helmet",
            () -> new MagisteelArmorBonus(ModArmorMaterials.MAGISTEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> MAGISTEEL_CHESTPLATE = ITEMS.register("magisteel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MAGISTEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> MAGISTEEL_LEGGINGS = ITEMS.register("magisteel_leggings",
            () -> new ArmorItem(ModArmorMaterials.MAGISTEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> MAGISTEEL_BOOTS = ITEMS.register("magisteel_boots",
            () -> new ArmorItem(ModArmorMaterials.MAGISTEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));

    public static final RegistryObject<Item> CURSED_SWORD = ITEMS.register("cursed_sword",
            () -> new CursedWeaponItem(ModTiers.CURSED, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> CURSED_PICKAXE = ITEMS.register("cursed_pickaxe",
            () -> new PickaxeItem(ModTiers.CURSED, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> CURSED_AXE = ITEMS.register("cursed_axe",
            () -> new AxeItem(ModTiers.CURSED, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> CURSED_SHOVEL = ITEMS.register("cursed_shovel",
            () -> new ShovelItem(ModTiers.CURSED, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> CURSED_HOE = ITEMS.register("cursed_hoe",
            () -> new HoeItem(ModTiers.CURSED, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> CURSED_HELMET = ITEMS.register("cursed_helmet",
            () -> new CursedArmorBonus(ModArmorMaterials.CURSED, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> CURSED_CHESTPLATE = ITEMS.register("cursed_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CURSED, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> CURSED_LEGGINGS = ITEMS.register("cursed_leggings",
            () -> new ArmorItem(ModArmorMaterials.CURSED, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> CURSED_BOOTS = ITEMS.register("cursed_boots",
            () -> new ArmorItem(ModArmorMaterials.CURSED, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModTiers.MITHRIL, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModTiers.MITHRIL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModTiers.MITHRIL, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModTiers.MITHRIL, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModTiers.MITHRIL, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new MithrilArmorBonus(ModArmorMaterials.MITHRIL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));

    public static final RegistryObject<Item> ADAMANT_SWORD = ITEMS.register("adamant_sword",
            () -> new AdamantWeaponItem(ModTiers.ADAMANT, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ADAMANT_PICKAXE = ITEMS.register("adamant_pickaxe",
            () -> new PickaxeItem(ModTiers.ADAMANT, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ADAMANT_AXE = ITEMS.register("adamant_axe",
            () -> new AxeItem(ModTiers.ADAMANT, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ADAMANT_SHOVEL = ITEMS.register("adamant_shovel",
            () -> new ShovelItem(ModTiers.ADAMANT, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ADAMANT_HOE = ITEMS.register("adamant_hoe",
            () -> new HoeItem(ModTiers.ADAMANT, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ADAMANT_HELMET = ITEMS.register("adamant_helmet",
            () -> new AdamantArmorBonus(ModArmorMaterials.ADAMANT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> ADAMANT_CHESTPLATE = ITEMS.register("adamant_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> ADAMANT_LEGGINGS = ITEMS.register("adamant_leggings",
            () -> new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> ADAMANT_BOOTS = ITEMS.register("adamant_boots",
            () -> new ArmorItem(ModArmorMaterials.ADAMANT, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));


    public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
            () -> new SwordItem(ModTiers.ORICHALCUM, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
            () -> new PickaxeItem(ModTiers.ORICHALCUM, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
            () -> new AxeItem(ModTiers.ORICHALCUM, 5, -3f,
                    new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
            () -> new ShovelItem(ModTiers.ORICHALCUM, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
            () -> new HoeItem(ModTiers.ORICHALCUM, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet",
            () -> new OrichalcumArmorBonus(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));

    public static final RegistryObject<Item> SCARLET_SWORD = ITEMS.register("scarlet_sword",
            () -> new ScarletWeaponItem(ModTiers.SCARLET, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> SCARLET_PICKAXE = ITEMS.register("scarlet_pickaxe",
            () -> new PickaxeItem(ModTiers.SCARLET, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SCARLET_AXE = ITEMS.register("scarlet_axe",
            () -> new AxeItem(ModTiers.SCARLET, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SCARLET_SHOVEL = ITEMS.register("scarlet_shovel",
            () -> new ShovelItem(ModTiers.SCARLET, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SCARLET_HOE = ITEMS.register("scarlet_hoe",
            () -> new HoeItem(ModTiers.SCARLET, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> SCARLET_HELMET = ITEMS.register("scarlet_helmet",
            () -> new ScarletArmorBonus(ModArmorMaterials.SCARLET, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> SCARLET_CHESTPLATE = ITEMS.register("scarlet_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SCARLET, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> SCARLET_LEGGINGS = ITEMS.register("scarlet_leggings",
            () -> new ArmorItem(ModArmorMaterials.SCARLET, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));
    public static final RegistryObject<Item> SCARLET_BOOTS = ITEMS.register("scarlet_boots",
            () -> new ArmorItem(ModArmorMaterials.SCARLET, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ISEKAI_ARMOR_TAB)));

    public static final RegistryObject<Item> DRAGON_SWORD = ITEMS.register("dragon_sword",
            () -> new DragonWeaponItem(ModTiers.DRAGON, 3, -2.4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DRAGON_PICKAXE = ITEMS.register("dragon_pickaxe",
            () -> new PickaxeItem(ModTiers.DRAGON, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DRAGON_AXE = ITEMS.register("dragon_axe",
            () -> new AxeItem(ModTiers.DRAGON, 5, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DRAGON_SHOVEL = ITEMS.register("dragon_shovel",
            () -> new ShovelItem(ModTiers.DRAGON, 1.5f, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DRAGON_HOE = ITEMS.register("dragon_hoe",
            () -> new HoeItem(ModTiers.DRAGON, -5, 4f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> FUTURE_SCRAP = ITEMS.register("future_scrap",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> FUTURE_PLATE = ITEMS.register("future_plate",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> TARATECT_CRYSTAL = ITEMS.register("taratect_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> INFUSED_SILK = ITEMS.register("infused_silk",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> QUEEN_TARATECT_CRYSTAL = ITEMS.register("queen_taratect_crystal",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> QUEEN_TARATECT_HEART = ITEMS.register("queen_taratect_heart",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> HIPOKTE_HERB = ITEMS.register("hipokte_herb",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> DRAGON_BONE = ITEMS.register("dragon_bone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> NAGA_SCALES = ITEMS.register("naga_scales",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
}
}
