package com.skyrstudios.vibraniumtechnologies.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab VIBRANIUM_TECHNOLOGIES_TAB = new CreativeModeTab("vibraniumtechnologiestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_VIBRANIUM.get());
        }
    };
}
