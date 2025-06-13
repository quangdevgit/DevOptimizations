package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.Entity.RemovalReason;

public class EntityOptimization {
    public static void register() {
        if (ModConfig.isEnabled("render.disableEntityCulling")) return;
        // Culling entity xa, giảm update entity phụ, tắt entity không cần thiết
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client == null || client.world == null || client.player == null) return;
            for (Entity entity : client.world.getEntities()) {
                double dist = entity.squaredDistanceTo(client.player);
                if (dist > 96*96) {
                    entity.setInvisible(true);
                    entity.setNoGravity(true);
                    entity.remove(RemovalReason.DISCARDED); // Xoá entity phụ xa khỏi bộ nhớ
                } else {
                    entity.setInvisible(false);
                    entity.setNoGravity(false);
                }
            }
        });
        // Tối ưu update rate cho entity/tile entity (nếu API hỗ trợ)
        // TODO: Nếu có API, hãy giảm tần suất update cho entity/tile entity ở đây
    }
}
