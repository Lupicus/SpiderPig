package com.lupicus.spig.renderer.entity.layers;

import com.lupicus.spig.Main;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.PigModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;

@Environment(EnvType.CLIENT)
public class PigEyesLayer<T extends Mob, M extends PigModel<T>> extends EyesLayer<T, M>
{
    private static final RenderType RENDER_TYPE = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Main.MODID, "textures/entity/pig_eyes.png"));

    public PigEyesLayer(RenderLayerParent<T, M> renderer) {
        super(renderer);
    }

    @Override
    public RenderType renderType() {
        return RENDER_TYPE;
    }
}
