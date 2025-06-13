package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;

public class NetworkOptimization {
    public static void register() {
        // Giảm gửi packet không cần thiết
        if (ModConfig.isEnabled("render.disableNetworkOptimization")) return;
        // TODO: Nếu có API, hãy tối ưu buffer, giảm tần suất keepalive, nén dữ liệu ở đây
        // ServerPlayConnectionEvents.INIT.register((handler, server) -> {
        //     // ...
        // });
    }
}
