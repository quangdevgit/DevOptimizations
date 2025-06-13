package com.dtqdev.devoptimization.config;

// Đảm bảo modmenu JAR có trong thư mục mods khi chạy game!
//import com.terraformersmc.modmenu.api.ConfigScreenFactory;
//import com.terraformersmc.modmenu.api.ModMenuApi;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.CheckboxWidget;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/*
public class DevOptimizationModMenuIntegration implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> new ConfigScreen(parent);
    }

    public static class ConfigScreen extends Screen {
        private final Screen parent;
        private final Map<String, CheckboxWidget> checkboxes = new HashMap<>();
        private final Properties props = ModConfig.getProperties();

        protected ConfigScreen(Screen parent) {
            super(Text.literal("DevOptimization Config"));
            this.parent = parent;
        }

        @Override
        protected void init() {
            int y = 30;
            int x = this.width / 2 - 100;
            int i = 0;
            for (String key : props.stringPropertyNames()) {
                boolean value = Boolean.parseBoolean(props.getProperty(key, "true"));
                CheckboxWidget cb = new CheckboxWidget(x, y + i * 24, 200, 20, Text.literal(key), value);
                this.addDrawableChild(cb);
                checkboxes.put(key, cb);
                i++;
            }
            this.addDrawableChild(ButtonWidget.builder(Text.literal("Done"), btn -> {
                for (Map.Entry<String, CheckboxWidget> entry : checkboxes.entrySet()) {
                    ModConfig.set(entry.getKey(), entry.getValue().isChecked());
                }
                ModConfig.save();
                MinecraftClient.getInstance().setScreen(parent);
            }).dimensions(x, y + i * 24 + 10, 200, 20).build());
        }
    }
}
*/