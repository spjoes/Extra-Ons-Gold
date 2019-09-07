package com.du.projectnarwhal.entity;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.ChickenEntityModel;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.util.Identifier;

public class DiamondChickenRenderer extends MobEntityRenderer<DiamondChickenEntity, ChickenEntityModel<DiamondChickenEntity>> {

    public DiamondChickenRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new ChickenEntityModel<>(), 1);
    }


    @Override
    protected Identifier getTexture(DiamondChickenEntity diamondChickenEntity)
    {
        return new Identifier("pnarwhal:textures/entity/diamondchicken.png");
    }
}
