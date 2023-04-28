package com.skyrstudios.vibraniumtechnologies.util;

import com.skyrstudios.vibraniumtechnologies.VibraniumTechnologies;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_VIBRANIUM_TOOL
                = tag("needs_vibranium_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(VibraniumTechnologies.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}