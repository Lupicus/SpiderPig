package com.lupicus.spig.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.PigModel;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SpiderPigRenderer extends MobRenderer<SpiderEntity, PigModel<SpiderEntity>>
{
    private static final ResourceLocation PIG_TEXTURES = new ResourceLocation("textures/entity/pig/pig.png");

    public SpiderPigRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PigModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(SpiderEntity entity) {
        return PIG_TEXTURES;
    }
}
