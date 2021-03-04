package io.github.mooy1.digitalstorage;

import io.github.mooy1.infinitylib.PluginUtils;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

import javax.annotation.Nonnull;

public final class DigitalStorage extends JavaPlugin implements SlimefunAddon {

    @Getter
    private static DigitalStorage instance;
    
    @Override
    public void onEnable() {
        instance = this;

        PluginUtils.setup(ChatColor.AQUA + "DigitalStorage", this, "Mooy1/DigitalStorage/master", getFile());
        
        
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/Mooy1/DigitalStorage/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
