package com.du.projectnarwhal.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.util.Identifier;

public class CreeperCowRenderer extends MobEntityRenderer<CreeperCowEntity, CowEntityModel<CreeperCowEntity>> {

    public CreeperCowRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new CowEntityModel<>(), 1);
    }


    @Override
    protected Identifier getTexture(CreeperCowEntity creeperCowEntity)
    {
        return new Identifier("pnarwhal:textures/entity/creepercow.png");
    }
}
