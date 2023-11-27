package me.dueris.canvas.mixin;

import org.bukkit.craftbukkit.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
    // Specifies the class to mixin into
public class ExampleMixin {
    @Inject(method = "main", at = @At("RETURN"))
    // Specifies what method to inject into
    private static void injectT(String[] args, CallbackInfo ci){
        System.out.println("Hello from Canvas!");
    }
}
