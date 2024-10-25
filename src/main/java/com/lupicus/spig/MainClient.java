package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.MeshTransformer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;

@Environment(EnvType.CLIENT)
public class MainClient implements ClientModInitializer
{
	public static final ModelLayerLocation PIG70 = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Main.MODID, "pig70"), "main");

	@Override
	public void onInitializeClient()
	{
		EntityModelLayerRegistry.registerModelLayer(PIG70, () -> PigModel.createBodyLayer(CubeDeformation.NONE).apply(MeshTransformer.scaling(0.7F)));

		EntityRendererRegistry.register(EntityType.SPIDER, SpiderPigRenderer::new);
		EntityRendererRegistry.register(EntityType.CAVE_SPIDER, CaveSpiderPigRenderer::new);
	}
}
