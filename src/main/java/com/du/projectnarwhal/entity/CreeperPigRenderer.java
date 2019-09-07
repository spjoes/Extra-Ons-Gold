package com.du.projectnarwhal.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.util.Identifier;

public class CreeperPigRenderer extends MobEntityRenderer<CreeperPigEntity, PigEntityModel<CreeperPigEntity>> {

    public CreeperPigRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new PigEntityModel<>(), 1);
    }


    @Override
    protected Identifier getTexture(CreeperPigEntity creeperPigEntity)
    {
        return new Identifier("pnarwhal:textures/entity/creeperpig.png");
    }
}
