package com.du.projectnarwhal.entity;

import com.du.projectnarwhal.entity.models.ModelBird;
import com.du.projectnarwhal.entity.models.ModelOwl;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class OwlRenderer extends MobEntityRenderer<OwlEntity, ModelOwl<OwlEntity>> {

    public OwlRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new ModelOwl<>(), 1);
    }

    @Override
    protected Identifier getTexture(OwlEntity owlEntity)
    {
        return new Identifier("pnarwhal:textures/entity/owl.png");
    }

}
