package me.dueris.canvas.mixin;

import me.dueris.canvas.CanvasExample;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * This is the MixinPlugin instance for your plugin. IF you DONT intend
 * on adding mixins for your plugin, you can delete the following files:
 * - This class
 * - "ignite.mod.json" inside your resources dir
 * - Your mixin json inside your resources dir(default is "mixin.example.core.json")
 * 
 * If you want a tutorial for how to use mixins, check out the fabric
 * mod tutorial for it on their website. Remember, this is JUST the server-side, so
 * no client classes would work, and Canvas uses the REOBF mappings during runtime!
 * 
 * This is similar to your other main plugin instance, however, MixinPlugins load very
 * differently than Bukkit/Paper/Canvas plugins. If your plugin is just to mixin to
 * a few files and thats it, you dont need this. However, if you want to add
 * your own plugin along with the mixins(like a normal bukkit plugin), then
 * you need to follow a few different steps for loading it with Canvas. And yes,
 * its cross-compatible, so it wont mess up compatibility with Purpur or Paper.
 * This just provides Canvas with a way to enable your plugin without disabling your mixins.
 *  -- To explain, Canvas loads your mixins into the server but keeps your plugin inside the classpath of the main server,
 *     thus making it so that your plugin is already loaded when the server is by the Ignite ClassLoader. When enabling
 *     plugins, Papers ModernPluginLoader tries to use its ClassLoader on your plugin, resulting in an error because
 *     your plugin rly shouldnt be loaded rn. Canvas fixes the server dying whenever this happens, but provides a warning
 *     incase you didnt read this message, or just didnt do it. To add your plugin to the plugin enable cycle, follow the instructions bellow.
 * 
 */
@Mixin(targets = "me.dueris.canvas.server.MixinPluginHook")
public class MixinPlugin {
    
    // Placeholder for enabling your plugin with startup arg providers, not needed.
    public void mainS(String[] args){
        new CanvasExample().onEnable();
    }

    // Placeholder for disabling your plugin with startup arg providers, not needed.
    public void mainD(String[] args){
        new CanvasExample().onDisable();
    }

    /**
     * This is the main hooks for the plugin startup cycle.
     * Use whatever methods bellow to inject your startup code into the launch
     * sequence. You can hook into all of them if you want, it will still work.
     * 
     * These methods inject into the CanvasMixinLoader which executes the methods
     * your injecting to during different launch cycles. Read above for more details.
     */
    /*
    @Inject(method = "preLoadHook", at = @At("HEAD"))
    private static void injectPreLoad(String[] args, CallbackInfo ci) {
        // Injects your startup code at preLoad. Similar to the fabric mod preloader.
        // This code will be executed immediately when the server starts(the HEAD of the main method)
    }

    @Inject(method = "preWorldLoadHook", at = @At("HEAD"))
    private static void injectPreWorld(String[] args, CallbackInfo ci) {
        // Injects your startup code before worlds are loaded, mimicing the STARTUP loading sequence.
    }

    @Inject(method = "postWorldLoadHook", at = @At("HEAD"))
    private static void injectPostWorld(String[] args, CallbackInfo ci) {
        // Injects your startup code after worlds are loaded, mimicing the POSTWORLD loading sequence.
    }

    @Inject(method = "pluginDisableHook", at = @At("HEAD"))
    private static void injectPluginDisable(String[] args, CallbackInfo ci) {
        // Injects your disable code during the plugin disable sequence.
    }
    */
}
