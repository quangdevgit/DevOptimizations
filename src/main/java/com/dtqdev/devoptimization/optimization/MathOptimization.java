package com.dtqdev.devoptimization.optimization;

import com.dtqdev.devoptimization.config.ModConfig;

public class MathOptimization {
    public static void register() {
        if (ModConfig.isEnabled("render.disableMathOptimization")) return;
        // TODO: Sử dụng fast math, thuật toán tối ưu cho logic game
    }
}
