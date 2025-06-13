package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
// import net.minecraft.client.option.ParticlesMode;

public class FPSOptimization {
    public static void register() {
        // Tắt particles để giảm tải GPU
        if (ModConfig.isEnabled("render.disableParticles")) {
            ClientTickEvents.END_CLIENT_TICK.register(client -> {
                if (client != null && client.options != null) {
                    // Ví dụ cho API mới (nếu có):
                    // client.options.getParticles().setValue(ParticlesMode.MINIMAL);
                }
            });
        }
    }
}
