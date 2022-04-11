package com.lupicus.spig.renderer.entity;

import com.lupicus.spig.renderer.entity.layers.PigEyesLayer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.mob.SpiderEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SpiderPigRenderer<T extends SpiderEntity> extends MobEntityRenderer<T, PigEntityModel<T>>
{
    private static final Identifier TEXTURES = new Identifier("spig:textures/entity/spider_pig.png");

    public SpiderPigRenderer(EntityRenderDispatcher renderManagerIn, EntityRendererRegistry.Context ctx) {
        super(renderManagerIn, new PigEntityModel<>(), 0.7F);
        addFeature(new PigEyesLayer<>(this));
    }

    @Override
    public Identifier getTexture(SpiderEntity entity) {
        return TEXTURES;
    }
}
