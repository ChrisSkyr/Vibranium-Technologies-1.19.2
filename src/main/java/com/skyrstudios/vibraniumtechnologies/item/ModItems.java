package com.skyrstudios.vibraniumtechnologies.item;

import com.skyrstudios.vibraniumtechnologies.VibraniumTechnologies;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
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
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.VIBRANIUM_TECHNOLOGIES_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
