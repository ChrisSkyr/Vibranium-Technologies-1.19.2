package com.skyrstudios.vibraniumtechnologies.item;

import com.skyrstudios.vibraniumtechnologies.VibraniumTechnologies;
import com.skyrstudios.vibraniumtechnologies.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier VIBRANIUM;

        static {
            VIBRANIUM = TierSortingRegistry.registerTier(
                    new ForgeTier(5, 3000, 50.0F, 10.0F, 24,
                            ModTags.Blocks.NEEDS_VIBRANIUM_TOOL, () -> Ingredient.of(ModItems.VIBRANIUM_INGOT.get())),
                    new ResourceLocation(VibraniumTechnologies.MOD_ID, "vibranium"), List.of(Tiers.NETHERITE), List.of());
        }
}
