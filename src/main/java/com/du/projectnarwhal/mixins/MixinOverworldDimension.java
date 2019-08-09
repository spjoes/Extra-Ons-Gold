package com.du.projectnarwhal.mixins;

import com.du.projectnarwhal.world.BiomeFeatures;
import net.minecraft.world.dimension.OverworldDimension;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(OverworldDimension.class)
public class MixinOverworldDimension {

    @Inject(method = "createChunkGenerator", at = @At("HEAD"))
    private void createChunkGenerator(CallbackInfoReturnable cir) {
        BiomeFeatures.addOres();
    }
}
