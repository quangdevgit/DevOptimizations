package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;

public class ThreadOptimization {
    public static void register() {
        if (ModConfig.isEnabled("render.disableThreadOptimization")) return;
        // TODO: Tối ưu hóa đa luồng: resource loading, chunk loading, v.v.
    }
}
