package com.lupicus.spig.renderer.entity.layers;

import com.lupicus.spig.Main;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PigEntityModel;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class PigEyesLayer<T extends MobEntity, M extends PigEntityModel<T>> extends EyesFeatureRenderer<T, M>
{
    private static final RenderLayer RENDER_TYPE = RenderLayer.getEyes(new Identifier(Main.MODID, "textures/entity/pig_eyes.png"));

    public PigEyesLayer(FeatureRendererContext<T, M> renderer) {
        super(renderer);
    }

    @Override
    public RenderLayer getEyesTexture() {
        return RENDER_TYPE;
    }
}
