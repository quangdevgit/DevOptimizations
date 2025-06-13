package com.example.mobileperformance.config;

import net.fabricmc.loader.api.FabricLoader;

public class ModConfig {
    private static final String CONFIG_FILE_NAME = "mobile_performance_config.json";
    private static final String CONFIG_DIRECTORY = FabricLoader.getInstance().getConfigDirectory().toString();

    private int renderDistance;
    private boolean enableVSync;
    private int maxFramerate;

    public ModConfig() {
        // Default values
        this.renderDistance = 8;
        this.enableVSync = true;
        this.maxFramerate = 60;
    }

    public int getRenderDistance() {
        return renderDistance;
    }

    public void setRenderDistance(int renderDistance) {
        this.renderDistance = renderDistance;
    }

    public boolean isEnableVSync() {
        return enableVSync;
    }

    public void setEnableVSync(boolean enableVSync) {
        this.enableVSync = enableVSync;
    }

    public int getMaxFramerate() {
        return maxFramerate;
    }

    public void setMaxFramerate(int maxFramerate) {
        this.maxFramerate = maxFramerate;
    }

    public void loadConfig() {
        // Logic to load configuration from CONFIG_DIRECTORY/CONFIG_FILE_NAME
    }

    public void saveConfig() {
        // Logic to save configuration to CONFIG_DIRECTORY/CONFIG_FILE_NAME
    }
}