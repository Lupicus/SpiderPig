package com.lupicus.spig.renderer.entity.layers;

import com.lupicus.spig.Main;

import net.minecraft.client.model.animal.pig.PigModel;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Mob;

public class PigEyesLayer<T extends Mob, M extends PigModel> extends EyesLayer<LivingEntityRenderState, M>
{
    private static final RenderType RENDER_TYPE = RenderTypes.eyes(Identifier.fromNamespaceAndPath(Main.MODID, "textures/entity/pig_eyes.png"));

    public PigEyesLayer(RenderLayerParent<LivingEntityRenderState, M> renderer) {
        super(renderer);
    }

    @Override
    public RenderType renderType() {
        return RENDER_TYPE;
    }
}
