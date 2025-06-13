package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;

public class CacheOptimization {
    public static void register() {
        if (ModConfig.isEnabled("render.disableCacheOptimization")) return;
        // TODO: Dọn dẹp cache định kỳ, tránh memory leak
    }
}
