package com.lupicus.spig.renderer.entity;

import com.lupicus.spig.MainClient;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.CaveSpider;

@Environment(EnvType.CLIENT)
public class CaveSpiderPigRenderer extends SpiderPigRenderer<CaveSpider>
{
    private static final ResourceLocation TEXTURES = ResourceLocation.parse("spig:textures/entity/cave_spider_pig.png");

    public CaveSpiderPigRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, MainClient.PIG70);
        this.shadowRadius = 0.56F;
    }

    @Override
    public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
        return TEXTURES;
    }
}
