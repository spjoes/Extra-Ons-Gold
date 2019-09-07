package com.du.projectnarwhal.entity.galaxy;

import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.util.Identifier;

public class GalaxyHorseRenderer extends MobEntityRenderer<HorseEntity, HorseEntityModel<HorseEntity>> {

    public GalaxyHorseRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new HorseEntityModel<>(0), 1);
    }

    @Override
    protected Identifier getTexture(HorseEntity horseEntity)
    {
        return new Identifier("pnarwhal:textures/entity/galaxyhorse.png");
    }

}
