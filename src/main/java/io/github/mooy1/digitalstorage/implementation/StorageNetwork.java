package io.github.mooy1.digitalstorage.implementation;

import io.github.mooy1.infinitylib.PluginUtils;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import javax.annotation.Nonnull;

public final class StorageNetwork implements Listener {
    
    private final Location core;
    
    
    
    public StorageNetwork(@Nonnull Location core) {
        this.core = core;
        
        PluginUtils.registerListener(this);
    }
    
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockBreak(BlockBreakEvent e) {
        
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onBlockPlace(BlockPlaceEvent e) {
        
    }
    
    
    
}
