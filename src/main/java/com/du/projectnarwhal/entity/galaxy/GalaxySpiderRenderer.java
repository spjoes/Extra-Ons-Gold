package com.du.projectnarwhal.entity.galaxy;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SpiderEntityModel;
import net.minecraft.client.render.entity.model.WolfEntityModel;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.Identifier;

public class GalaxySpiderRenderer extends MobEntityRenderer<SpiderEntity, SpiderEntityModel<SpiderEntity>> {

    public GalaxySpiderRenderer(EntityRenderDispatcher entityRenderDispatcher_1)
    {
        super(entityRenderDispatcher_1, new SpiderEntityModel<>(), 1);
    }

    @Override
    protected Identifier getTexture(SpiderEntity spiderEntity)
    {
        return new Identifier("pnarwhal:textures/entity/galaxywolf.png");
    }

}
