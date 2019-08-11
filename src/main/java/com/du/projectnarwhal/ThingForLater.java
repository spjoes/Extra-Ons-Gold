package com.du.projectnarwhal;

import org.spongepowered.asm.mixin.Unique;

public interface ThingForLater {
    @Unique
    double getInfectedLevel();

    @Unique void setInfectedLevel(double newLevel);
}