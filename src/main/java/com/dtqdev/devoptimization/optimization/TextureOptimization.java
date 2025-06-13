package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.TextureManager;

public class TextureOptimization {
    public static void register() {
        if (ModConfig.isEnabled("render.dynamicTextureRes")) {
            ClientTickEvents.END_CLIENT_TICK.register(client -> {
                if (client != null && client.options != null) {
                    client.options.getMipmapLevels().setValue(0);
                }
            });
        }
        // Texture streaming: chỉ tải texture cần thiết (giả lập)
        if (ModConfig.isEnabled("render.textureStreaming")) {
            ClientTickEvents.END_CLIENT_TICK.register(client -> {
                if (client != null) {
                    TextureManager tm = client.getTextureManager();
                    // Dọn dẹp texture không còn sử dụng mỗi 10 giây
                    if (client.world != null && client.world.getTime() % 200 == 0) {
                        tm.tick();
                    }
                }
            });
        }
    }
}
