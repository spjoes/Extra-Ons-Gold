package com.du.projectnarwhal.mixins;

import com.du.projectnarwhal.ThingForLater;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(PlayerEntity.class)
public class MixinPlayerEntity implements ThingForLater {

    public double infectedrate = 0;

    @Override
    public void setInfectedLevel(double level) {
        this.infectedrate = level; }

    @Override
    public double getInfectedLevel() {
        return this.infectedrate;
    }
}
