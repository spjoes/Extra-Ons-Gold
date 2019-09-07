package com.du.projectnarwhal.entity.galaxy;

import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.entity.passive.*;
import net.minecraft.util.Identifier;

public class GalaxyRabbitRenderer extends MobEntityRenderer<RabbitEntity, RabbitEntityModel<RabbitEntity>> {

    public GalaxyRabbitRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new RabbitEntityModel<>(), 1);
    }

    @Override
    protected Identifier getTexture(RabbitEntity rabbitEntity)
    {
        return new Identifier("pnarwhal:textures/entity/galaxyrabbit.png");
    }

}
