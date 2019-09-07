package com.du.projectnarwhal.init;

import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.world.gen.feature.placement.CountSurface32Placement;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.CountDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;

public class PNarwhalPlacements {

    public static final Decorator<CountDecoratorConfig> COUNT_UNDERGROUND_32 = new CountSurface32Placement(CountDecoratorConfig::deserialize, UndergroundPlacementLevel.INSTANCE);
    static {
       Registry.register(Registry.DECORATOR, new Identifier(ProjectNarwhal.MOD_ID, "count_underground_32"), COUNT_UNDERGROUND_32);
       }

}
