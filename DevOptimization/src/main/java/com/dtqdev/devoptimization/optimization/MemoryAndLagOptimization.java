package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class MemoryAndLagOptimization {
    private static int tickCounter = 0;

    public static void register() {
        if (ModConfig.isEnabled("render.disableMemoryOptimization")) return;
        // Dọn dẹp bộ nhớ định kỳ trên client, dọn cache, giảm memory leak, tối ưu buffer
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            tickCounter++;
            if (tickCounter % 200 == 0) { // Mỗi 10 giây
                System.gc();
                // TODO: Dọn cache, tối ưu buffer nếu có
            }
        });
    }
}
