package com.dtqdev.devoptimization;

import com.dtqdev.devoptimization.optimization.FPSOptimization;
import com.dtqdev.devoptimization.optimization.MemoryAndLagOptimization;
import com.dtqdev.devoptimization.optimization.RenderOptimization;
import com.dtqdev.devoptimization.optimization.EntityOptimization;
import com.dtqdev.devoptimization.optimization.AIOptimization;
import com.dtqdev.devoptimization.optimization.NetworkOptimization;
import com.dtqdev.devoptimization.optimization.TextureOptimization;
import com.dtqdev.devoptimization.optimization.SoundOptimization;
import com.dtqdev.devoptimization.optimization.WorldOptimization;
import com.dtqdev.devoptimization.optimization.ThreadOptimization;
import com.dtqdev.devoptimization.optimization.MathOptimization;
import com.dtqdev.devoptimization.optimization.CacheOptimization;
import com.dtqdev.devoptimization.config.ModConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DevOptimizationMod  {
    public static final String MOD_ID = "devoptimization";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public void onInitialize() {
        LOGGER.info("DevOptimization mod loaded! Tối ưu hóa hiệu suất cho thiết bị di động sử dụng PojavLauncher.");
        ModConfig.load();
        RenderOptimization.register();
        FPSOptimization.register();
        MemoryAndLagOptimization.register();
        EntityOptimization.register();
        AIOptimization.register();
        NetworkOptimization.register();
        TextureOptimization.register();
        SoundOptimization.register();
        WorldOptimization.register();
        ThreadOptimization.register();
        MathOptimization.register();
        CacheOptimization.register();
    }
}
