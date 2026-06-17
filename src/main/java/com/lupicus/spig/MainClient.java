package com.lupicus.spig;

import com.lupicus.spig.renderer.entity.CaveSpiderPigRenderer;
import com.lupicus.spig.renderer.entity.SpiderPigRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.animal.pig.PigModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.MeshTransformer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityTypes;

@Environment(EnvType.CLIENT)
public class MainClient implements ClientModInitializer
{
	public static final ModelLayerLocation PIG70 = new ModelLayerLocation(Identifier.fromNamespaceAndPath(Main.MODID, "pig70"), "main");

	@Override
	public void onInitializeClient()
	{
		ModelLayerRegistry.registerModelLayer(PIG70, () -> PigModel.createBodyLayer(CubeDeformation.NONE).apply(MeshTransformer.scaling(0.7F)));

		EntityRenderers.register(EntityTypes.SPIDER, SpiderPigRenderer::new);
		EntityRenderers.register(EntityTypes.CAVE_SPIDER, CaveSpiderPigRenderer::new);
	}
}
