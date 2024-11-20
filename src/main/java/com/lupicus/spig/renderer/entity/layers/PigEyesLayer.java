package com.lupicus.spig.renderer.entity.layers;

import com.lupicus.spig.Main;

import net.minecraft.client.model.PigModel;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PigEyesLayer<T extends Mob, M extends PigModel> extends EyesLayer<LivingEntityRenderState, M>
{
    private static final RenderType RENDER_TYPE = RenderType.eyes(ResourceLocation.fromNamespaceAndPath(Main.MODID, "textures/entity/pig_eyes.png"));

    public PigEyesLayer(RenderLayerParent<LivingEntityRenderState, M> renderer) {
        super(renderer);
    }

    @Override
    public RenderType renderType() {
        return RENDER_TYPE;
    }
}
