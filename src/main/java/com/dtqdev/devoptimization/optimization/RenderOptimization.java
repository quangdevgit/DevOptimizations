package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.GameOptions;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
// import net.minecraft.client.option.ParticlesMode;

public class RenderOptimization {
    public static void register() {
        // Culling entity ngoài tầm nhìn
        if (ModConfig.isEnabled("render.cullEntities")) {
            WorldRenderEvents.BEFORE_ENTITIES.register(context -> {
                MinecraftClient client = MinecraftClient.getInstance();
                if (client.world == null || client.player == null) return;
                Box cameraBox = client.player.getBoundingBox().expand(96);
                for (Entity entity : client.world.getEntities()) {
                    if (!cameraBox.intersects(entity.getBoundingBox())) {
                        entity.setInvisible(true);
                    } else {
                        entity.setInvisible(false);
                    }
                }
            });
        }
        // Tối ưu tuỳ chọn render
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client != null && client.options != null) {
                GameOptions options = client.options;
                // Tắt particles nếu API hỗ trợ
                // if (ModConfig.isEnabled("render.disableParticles")) options.getParticles().setValue(ParticlesMode.MINIMAL);
                // Tối ưu cloud, sky, weather, sun/moon nếu API hỗ trợ
                // if (ModConfig.isEnabled("render.disableClouds")) options.getClouds().setValue(false);
                // if (ModConfig.isEnabled("render.disableSky")) options.getSky().setValue(false);
                // if (ModConfig.isEnabled("render.disableSunMoon")) options.getSunMoon().setValue(false);
                // if (ModConfig.isEnabled("render.disableWeather")) options.getWeather().setValue(false);
                // Tối ưu mipmap (giảm chất lượng texture)
                // if (ModConfig.isEnabled("render.dynamicTextureRes")) options.getMipmapLevels().setValue(0);
                // Tối ưu gamma (độ sáng)
                // if (ModConfig.isEnabled("render.optimizeLighting")) options.getGamma().setValue(1.0);
                // Tắt các hiệu ứng động nếu API hỗ trợ
                // if (ModConfig.isEnabled("render.disableLeavesAnimation")) options.getLeavesAnimation().setValue(false);
                // if (ModConfig.isEnabled("render.disableWaterAnimation")) options.getWaterAnimation().setValue(false);
                // if (ModConfig.isEnabled("render.disableFireAnimation")) options.getFireAnimation().setValue(false);
                // if (ModConfig.isEnabled("render.disableLavaAnimation")) options.getLavaAnimation().setValue(false);
                // if (ModConfig.isEnabled("render.disablePortalAnimation")) options.getPortalAnimation().setValue(false);
            }
        });
    }
}
