package com.du.projectnarwhal.entity.galaxy;

import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.model.WolfEntityModel;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.Identifier;

public class GalaxyWolfRenderer extends MobEntityRenderer<WolfEntity, WolfEntityModel<WolfEntity>> {

    public GalaxyWolfRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new WolfEntityModel<>(), 1);
    }

    @Override
    protected Identifier getTexture(WolfEntity wolfEntity)
    {
        return new Identifier("pnarwhal:textures/entity/galaxywolf.png");
    }

}
