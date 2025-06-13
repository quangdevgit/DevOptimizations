package com.dtqdev.devoptimization.config;

// import com.terraformersmc.modmenu.api.ConfigScreenFactory;
// import com.terraformersmc.modmenu.api.ModMenuApi;
// import net.minecraft.client.gui.screen.Screen;
// import net.minecraft.client.gui.widget.ButtonWidget;
// import net.minecraft.text.Text;
// import net.minecraft.client.MinecraftClient;
// import net.minecraft.client.gui.widget.OptionSliderWidget;
// import net.minecraft.client.gui.widget.CheckboxWidget;
// import net.minecraft.client.gui.widget.OptionButtonWidget;
// import net.minecraft.client.gui.screen.ScreenTexts;

// import java.util.Properties;
// import java.util.Map;
// import java.util.HashMap;

// public class ModConfigScreen extends Screen implements ModMenuApi {
//     private final Screen parent;
//     private final Map<String, CheckboxWidget> checkboxes = new HashMap<>();

//     public ModConfigScreen(Screen parent) {
//         super(Text.literal("DevOptimization Config"));
//         this.parent = parent;
//     }

//     @Override
//     protected void init() {
//         int y = 30;
//         int x = this.width / 2 - 100;
//         Properties props = ModConfig.getProperties();
//         int i = 0;
//         for (String key : props.stringPropertyNames()) {
//             boolean value = Boolean.parseBoolean(props.getProperty(key, "true"));
//             CheckboxWidget cb = new CheckboxWidget(x, y + i * 24, 200, 20, Text.literal(key), value);
//             this.addDrawableChild(cb);
//             checkboxes.put(key, cb);
//             i++;
//         }
//         this.addDrawableChild(ButtonWidget.builder(ScreenTexts.DONE, btn -> {
//             for (Map.Entry<String, CheckboxWidget> entry : checkboxes.entrySet()) {
//                 ModConfig.set(entry.getKey(), entry.getValue().isChecked());
//             }
//             ModConfig.save();
//             MinecraftClient.getInstance().setScreen(parent);
//         }).dimensions(x, y + i * 24 + 10, 200, 20).build());
//     }

//     @Override
//     public ConfigScreenFactory<?> getModConfigScreenFactory() {
//         return parent -> new ModConfigScreen(parent);
//     }
// }
