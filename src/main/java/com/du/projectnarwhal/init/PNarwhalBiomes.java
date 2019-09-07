package com.du.projectnarwhal.init;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.biomes.SheepBiome;
import com.du.projectnarwhal.world.biomes.GalaxyPlains;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class PNarwhalBiomes {

    public static Biome SHEEP_BIOME;
    public static Biome GALAXY_PLAINS;

    static {

        SHEEP_BIOME = Registry.register(Registry.BIOME, new Identifier(ProjectNarwhal.MOD_ID, "sheep_biome"), new SheepBiome());
        GALAXY_PLAINS = Registry.register(Registry.BIOME, new Identifier(ProjectNarwhal.MOD_ID, "shadow_plains"), new GalaxyPlains());
    }
}
