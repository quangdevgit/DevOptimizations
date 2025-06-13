package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;

public class AIOptimization {
    private static int tickCounter = 0;

    public static void register() {
        if (ModConfig.isEnabled("render.disableAI")) return;
        // Giảm tần suất update AI, đơn giản hóa pathfinding cho mob, tắt AI mob xa
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            tickCounter++;
            if (client == null || client.world == null) return;
            for (LivingEntity entity : client.world.getEntitiesByClass(LivingEntity.class, client.player.getBoundingBox().expand(96), e -> true)) {
                if (entity instanceof MobEntity mob) {
                    // Chỉ update AI mỗi 10 tick để giảm CPU
                    if (tickCounter % 10 != 0) {
                        mob.setAiDisabled(true);
                    } else {
                        mob.setAiDisabled(false);
                    }
                    // Đơn giản hóa pathfinding (giảm tần suất update path)
                    if (tickCounter % 40 != 0) {
                        mob.getNavigation().stop();
                    }
                }
            }
        });
    }
}
