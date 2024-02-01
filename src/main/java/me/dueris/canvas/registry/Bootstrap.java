package me.dueris.canvas.registry;

import org.jetbrains.annotations.NotNull;

import io.papermc.paper.plugin.bootstrap.BootstrapContext;
import io.papermc.paper.plugin.bootstrap.PluginBootstrap;

public class Bootstrap implements PluginBootstrap{

    @Override
    /**
     * This is the bootstrap method for Paper plugins to hook into early
     * startup cycles(specifically before registries are frozen) to allow
     * plugins to run startup processes and other code segments earlier
     * in bootup.
     * 
     * You CANNOT use the Bukkit api when using this. Due to Bukkit not being
     * loaded yet(Bukkit is a PATCH on vanilla, so vanilla starts first with
     * Bukkit modifications, and then CraftBukkit loads for the api), you
     * are unable to access any CraftBukkit instances in this stage.
     */
    public void bootstrap(@NotNull BootstrapContext context) {
        System.out.println("CanvasExample bootstrap");
    }
}
