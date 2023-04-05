package com.example.examplemod.entity.client;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.entity.custom.ChomperEntity;
import com.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;



public class ChomperModel extends AnimatedGeoModel<ChomperEntity> {
    @Override
    public ResourceLocation getModelResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/entity.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ChomperEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/entity.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ChomperEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/entity.animation.json");
    }
}
