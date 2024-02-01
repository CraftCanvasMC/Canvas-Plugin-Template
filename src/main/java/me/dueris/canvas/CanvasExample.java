package me.dueris.canvas;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is the main instance of your plugin.
 * This class represents everything about your plugin, from its logger
 * to the methods that turn it on and off.
 */
public class CanvasExample extends JavaPlugin implements Listener {

    @Override
    /**
     * This is the onEnable method for your plugin, upon the server starting,
     * your plugin will be loaded and this method will be called.
     */
    public void onEnable(){
        // Plugin enable
    }

    @Override
    /**
     * This is the onDisable method for your plugin, upon the server shutting down,
     * your plugin will be disabled and this method will be called.
     */
    public void onDisable(){
        // Plugin disable
    }
}