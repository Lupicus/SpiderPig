package com.lupicus.spig.renderer.entity;

import com.lupicus.spig.renderer.entity.layers.PigEyesLayer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SpiderPigRenderer<T extends SpiderEntity> extends MobEntityRenderer<T, PigEntityModel<T>>
{
    private static final Identifier TEXTURES = new Identifier("spig:textures/entity/spider_pig.png");

    public SpiderPigRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PigEntityModel<>(ctx.getPart(EntityModelLayers.PIG)), 0.7F);
        addFeature(new PigEyesLayer<>(this));
    }

    @Override
    public Identifier getTexture(SpiderEntity entity) {
        return TEXTURES;
    }
}
