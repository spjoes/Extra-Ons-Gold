package com.du.projectnarwhal.entity;

import com.du.projectnarwhal.entity.models.ModelBird;
import com.du.projectnarwhal.entity.models.ModelPenguin;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CreeperEntityModel;
import net.minecraft.client.render.entity.model.ParrotEntityModel;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.util.Identifier;

public class BirdRenderer extends MobEntityRenderer<BirdEntity, ModelBird<BirdEntity>> {

    public BirdRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new ModelBird<>(), 1);
    }

    @Override
    protected Identifier getTexture(BirdEntity birdEntity)
    {
        return new Identifier("pnarwhal:textures/entity/bird.png");
    }

}
