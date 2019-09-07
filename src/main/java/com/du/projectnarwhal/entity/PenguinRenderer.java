package com.du.projectnarwhal.entity;

import com.du.projectnarwhal.entity.models.ModelPenguin;
import com.du.projectnarwhal.entity.models.ModelSeaLion;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.PolarBearEntityModel;
import net.minecraft.util.Identifier;

public class PenguinRenderer extends MobEntityRenderer<PenguinEntity, ModelPenguin<PenguinEntity>> {

    public PenguinRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new ModelPenguin<>(), 1);
    }


    @Override
    protected Identifier getTexture(PenguinEntity penguinEntity)
    {
        return new Identifier("pnarwhal:textures/entity/penguin.png");
    }
}
