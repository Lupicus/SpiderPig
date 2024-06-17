package com.lupicus.spig.renderer.entity;

import com.lupicus.spig.renderer.entity.layers.PigEyesLayer;

import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Spider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SpiderPigRenderer<T extends Spider> extends MobRenderer<T, PigModel<T>>
{
    private static final ResourceLocation TEXTURES = ResourceLocation.parse("spig:textures/entity/spider_pig.png");

    public SpiderPigRenderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new PigModel<>(renderManagerIn.bakeLayer(ModelLayers.PIG)), 0.7F);
        addLayer(new PigEyesLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Spider entity) {
        return TEXTURES;
    }
}
