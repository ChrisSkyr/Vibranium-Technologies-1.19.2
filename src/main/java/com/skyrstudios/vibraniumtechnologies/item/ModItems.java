package com.skyrstudios.vibraniumtechnologies.item;

import com.skyrstudios.vibraniumtechnologies.VibraniumTechnologies;
import com.skyrstudios.vibraniumtechnologies.item.custom.FuelItem;
import com.skyrstudios.vibraniumtechnologies.item.custom.armors.GildedArmorItem;
import com.skyrstudios.vibraniumtechnologies.item.custom.armors.GildedVibraniumArmorItem;
import com.skyrstudios.vibraniumtechnologies.item.custom.armors.VibraniumArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VibraniumTechnologies.MOD_ID);

    public static RegistryObject<Item> RAW_VIBRANIUM = ITEMS.register("raw_vibranium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static RegistryObject<Item> VIBRANIUM_INGOT = ITEMS.register("vibranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static RegistryObject<Item> VIBRANIUM_NUGGET = ITEMS.register("vibranium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget",
            () -> new FuelItem(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB), 177));

    public static  RegistryObject<PickaxeItem> VIBRANIUM_PICKAXE = ITEMS.register("vibranium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VIBRANIUM, -3, -2.8f, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static  RegistryObject<SwordItem> VIBRANIUM_SWORD = ITEMS.register("vibranium_sword",
            () -> new SwordItem(ModToolTiers.VIBRANIUM, -1, -2.4f, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static  RegistryObject<AxeItem> VIBRANIUM_AXE = ITEMS.register("vibranium_axe",
            () -> new AxeItem(ModToolTiers.VIBRANIUM, 4, -3, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static  RegistryObject<ShovelItem> VIBRANIUM_SHOVEL = ITEMS.register("vibranium_shovel",
            () -> new ShovelItem(ModToolTiers.VIBRANIUM, -2.5f, -3, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static  RegistryObject<HoeItem> VIBRANIUM_HOE = ITEMS.register("vibranium_hoe",
            () -> new HoeItem(ModToolTiers.VIBRANIUM, -10, 2, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    //                                   --ARMOR--

    //Vibranium Armor
    public static RegistryObject<Item> VIBRANIUM_HELMET = ITEMS.register("vibranium_helmet",
            () -> new VibraniumArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> VIBRANIUM_CHESTPLATE = ITEMS.register("vibranium_chestplate",
            () -> new VibraniumArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> VIBRANIUM_LEGGINGS = ITEMS.register("vibranium_leggings",
            () -> new VibraniumArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> VIBRANIUM_BOOTS = ITEMS.register("vibranium_boots",
            () -> new VibraniumArmorItem(ModArmorMaterials.VIBRANIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    //Gilded Vibranium Armor
    public static RegistryObject<Item> GILDED_VIBRANIUM_HELMET = ITEMS.register("gilded_vibranium_helmet",
            () -> new GildedVibraniumArmorItem(ModArmorMaterials.GILDED_VIBRANIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_VIBRANIUM_CHESTPLATE = ITEMS.register("gilded_vibranium_chestplate",
            () -> new GildedVibraniumArmorItem(ModArmorMaterials.GILDED_VIBRANIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_VIBRANIUM_LEGGINGS = ITEMS.register("gilded_vibranium_leggings",
            () -> new GildedVibraniumArmorItem(ModArmorMaterials.GILDED_VIBRANIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_VIBRANIUM_BOOTS = ITEMS.register("gilded_vibranium_boots",
            () -> new GildedVibraniumArmorItem(ModArmorMaterials.GILDED_VIBRANIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    //Gilded Diamond Armor
    public static RegistryObject<Item> GILDED_DIAMOND_HELMET = ITEMS.register("gilded_diamond_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_DIAMOND_CHESTPLATE = ITEMS.register("gilded_diamond_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_DIAMOND_LEGGINGS = ITEMS.register("gilded_diamond_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_DIAMOND_BOOTS = ITEMS.register("gilded_diamond_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_DIAMOND, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    //Gilded Iron Armor
    public static RegistryObject<Item> GILDED_IRON_HELMET = ITEMS.register("gilded_iron_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_IRON_CHESTPLATE = ITEMS.register("gilded_iron_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_IRON_LEGGINGS = ITEMS.register("gilded_iron_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_IRON_BOOTS = ITEMS.register("gilded_iron_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_IRON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    //Gilded Netherite Armor
    public static RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));
    public static RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots",
            () -> new GildedArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
