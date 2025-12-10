package com.lupicus.spig.renderer.entity;

import com.lupicus.spig.renderer.entity.layers.PigEyesLayer;

import net.minecraft.client.model.animal.pig.PigModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SpiderPigRenderer<T extends Spider> extends MobRenderer<T, LivingEntityRenderState, PigModel>
{
    private static final Identifier TEXTURES = Identifier.parse("spig:textures/entity/spider_pig.png");

    public SpiderPigRenderer(EntityRendererProvider.Context ctx) {
    	this(ctx, ModelLayers.PIG);
    }

    public SpiderPigRenderer(EntityRendererProvider.Context ctx, ModelLayerLocation modelLayerLocation) {
        super(ctx, new PigModel(ctx.bakeLayer(modelLayerLocation)), 0.7F);
        addLayer(new PigEyesLayer<>(this));
    }

    @Override
    public Identifier getTextureLocation(LivingEntityRenderState state) {
        return TEXTURES;
    }

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}
}
