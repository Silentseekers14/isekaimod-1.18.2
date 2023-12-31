package net.silentseekers14.isekaimod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.silentseekers14.isekaimod.IsekaiMod;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MAGISTEEL("magisteel", 37, new int[]{3, 6, 8, 3}, 20, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0F, () -> {
        return Ingredient.of(ModItems.MAGISTEEL_INGOT.get());
    }),
    CURSED("cursed", 45, new int[]{4, 7, 10, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.CURSED_INGOT.get());
    }),
    MITHRIL("mithril", 45, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.MITHRIL_INGOT.get());
    }),
    ADAMANT("adamant", 60, new int[]{5, 8, 12, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.ADAMANT_INGOT.get());
    }),
    ORICHALCUM("orichalcum", 60, new int[]{5, 8, 11, 5}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.1F, () -> {
        return Ingredient.of(ModItems.ORICHALCUM_INGOT.get());
    }),
    SCARLET("scarlet", 100, new int[]{6, 9, 14, 6}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 5.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.SCARLET_INGOT.get());
    });

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return IsekaiMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
