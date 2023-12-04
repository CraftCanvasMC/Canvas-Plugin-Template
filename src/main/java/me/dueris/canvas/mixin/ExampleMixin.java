package me.dueris.canvas.mixin;

import org.bukkit.craftbukkit.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "org.bukkit.craftbukkit.Main")
public class ExampleMixin {
    @Inject(method = "main", at = @At("HEAD"))
    // Specifies what method to inject into
    private static void injectT(String[] args, CallbackInfo ci) {
        System.out.println("loL");
    }
}
