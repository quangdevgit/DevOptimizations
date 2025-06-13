package com.dtqdev.devoptimization.config;

import java.util.Properties;
import java.io.*;

public class ModConfig {
    private static final String CONFIG_PATH = "config/devoptimization.properties";
    private static Properties props = new Properties();

    static {
        load();
    }

    public static void load() {
        try {
            File file = new File(CONFIG_PATH);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
                setDefaults();
                save();
            } else {
                try (FileInputStream fis = new FileInputStream(file)) {
                    props.load(fis);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void save() {
        try (FileOutputStream fos = new FileOutputStream(CONFIG_PATH)) {
            props.store(fos, "DevOptimization Mod Config");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void setDefaults() {
        props.setProperty("render.cullEntities", "true");
        props.setProperty("render.cullParticles", "true");
        props.setProperty("render.simplifyBlockEntities", "true");
        props.setProperty("render.disableFog", "true");
        props.setProperty("render.disableWeather", "true");
        props.setProperty("render.dynamicTextureRes", "true");
        props.setProperty("render.asyncChunkLoad", "true");
        props.setProperty("render.optimizeLighting", "true");
        props.setProperty("render.reduceVisualEffects", "true");
        props.setProperty("render.dynamicFpsLimiter", "true");
        props.setProperty("render.prioritizeNearby", "true");
        props.setProperty("render.disableShadows", "true");
        props.setProperty("render.disableClouds", "true");
        props.setProperty("render.disableSky", "true");
        props.setProperty("render.disableSunMoon", "true");
        props.setProperty("render.disableRainSplash", "true");
        props.setProperty("render.disableLeavesAnimation", "true");
        props.setProperty("render.disableWaterAnimation", "true");
        props.setProperty("render.disableFireAnimation", "true");
        props.setProperty("render.disableLavaAnimation", "true");
        props.setProperty("render.disablePortalAnimation", "true");
        props.setProperty("render.disableParticles", "true");
        props.setProperty("render.disableEntityShadows", "true");
        props.setProperty("render.disableBlockEntityRender", "true");
        props.setProperty("render.disableItemPhysics", "true");
        props.setProperty("render.disableEntityPhysics", "true");
        props.setProperty("render.disableBlockPhysics", "true");
        props.setProperty("render.disableBlockBreakingParticles", "true");
        props.setProperty("render.disableBlockBreakingSound", "true");
        props.setProperty("render.disableEntitySound", "true");
        props.setProperty("render.disableAmbientSound", "true");
        props.setProperty("render.disableMusic", "true");
        props.setProperty("render.disableBiomeMusic", "true");
        props.setProperty("render.disableWeatherSound", "true");
        props.setProperty("render.disableFootsteps", "true");
        props.setProperty("render.disableArmorStandRender", "true");
        props.setProperty("render.disableBannerRender", "true");
        props.setProperty("render.disableSignRender", "true");
        props.setProperty("render.disableChestRender", "true");
        props.setProperty("render.disableBedRender", "true");
        props.setProperty("render.disableBeaconRender", "true");
        props.setProperty("render.disableEndGatewayRender", "true");
        props.setProperty("render.disableEndPortalRender", "true");
        props.setProperty("render.disableShulkerBoxRender", "true");
        props.setProperty("render.disableSkullRender", "true");
        props.setProperty("render.disableConduitRender", "true");
        props.setProperty("render.disableCampfireRender", "true");
        props.setProperty("render.disableBellRender", "true");
        props.setProperty("render.disableSpawnerRender", "true");
        props.setProperty("render.disableLecternRender", "true");
        props.setProperty("render.disableJukeboxRender", "true");
        props.setProperty("render.disableNoteBlockRender", "true");
        props.setProperty("render.disablePistonRender", "true");
        props.setProperty("render.disableRedstoneRender", "true");
        props.setProperty("render.disableTripwireRender", "true");
        props.setProperty("render.disableVineRender", "true");
        props.setProperty("render.disableFlowerPotRender", "true");
        props.setProperty("render.disableItemFrameRender", "true");
        props.setProperty("render.disablePaintingRender", "true");
        props.setProperty("render.disableMinecartRender", "true");
        props.setProperty("render.disableBoatRender", "true");
        props.setProperty("render.disableArmorRender", "true");
        props.setProperty("render.disableElytraRender", "true");
        props.setProperty("render.disableTridentRender", "true");
        props.setProperty("render.disableFishingBobberRender", "true");
        props.setProperty("render.disableLeashKnotRender", "true");
        props.setProperty("render.disableLightningBoltRender", "true");
        props.setProperty("render.disableXPOrbRender", "true");
        props.setProperty("render.disableEndCrystalRender", "true");
        props.setProperty("render.disableWitherSkullRender", "true");
        props.setProperty("render.disableDragonFireballRender", "true");
        props.setProperty("render.disableFireworkRender", "true");
        props.setProperty("render.disableSnowballRender", "true");
        props.setProperty("render.disableEggRender", "true");
        props.setProperty("render.disablePotionRender", "true");
        props.setProperty("render.disableExperienceBottleRender", "true");
        props.setProperty("render.disableTNTPrimedRender", "true");
        props.setProperty("render.disableFallingBlockRender", "true");
        props.setProperty("render.disableAreaEffectCloudRender", "true");
        props.setProperty("render.disableEvokerFangsRender", "true");
        props.setProperty("render.disableSpectralArrowRender", "true");
        props.setProperty("render.disableArrowRender", "true");
        props.setProperty("render.disableEntityCulling", "true");
        props.setProperty("render.disableBlockCulling", "true");
        props.setProperty("render.disableChunkCulling", "true");
        props.setProperty("render.disableAI", "true");
        props.setProperty("render.disableEntityTick", "true");
        props.setProperty("render.disableBlockTick", "true");
        props.setProperty("render.disableRandomTick", "true");
        props.setProperty("render.disableTileEntityTick", "true");
        props.setProperty("render.disableChunkTick", "true");
        props.setProperty("render.disableWorldTick", "true");
        props.setProperty("render.disableNetworkOptimization", "true");
        props.setProperty("render.disableMemoryOptimization", "true");
        props.setProperty("render.disableThreadOptimization", "true");
        props.setProperty("render.disableCacheOptimization", "true");
        props.setProperty("render.disableBatteryOptimization", "true");
        props.setProperty("render.disableMenuOptimization", "true");
        props.setProperty("render.disableOtherOptimization", "true");
    }

    public static boolean isEnabled(String key) {
        return Boolean.parseBoolean(props.getProperty(key, "true"));
    }

    public static Properties getProperties() {
        return props;
    }
    public static void set(String key, boolean value) {
        props.setProperty(key, Boolean.toString(value));
    }
}
