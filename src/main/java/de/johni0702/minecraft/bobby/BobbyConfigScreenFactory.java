package de.johni0702.minecraft.bobby;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import java.util.function.Consumer;

public class BobbyConfigScreenFactory {
    public static Screen createConfigScreen(Screen parent, BobbyConfig config, Consumer<BobbyConfig> saveConsumer) {
        ConfigBuilder builder = ConfigBuilder.create()
                .setParentScreen(parent)
                .setTitle(Text.literal("Bobby Settings"));

        return builder.build();
    }
}