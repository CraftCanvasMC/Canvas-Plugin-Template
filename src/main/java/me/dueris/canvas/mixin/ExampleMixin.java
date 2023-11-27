package me.dueris.canvas.mixin;

import org.bukkit.craftbukkit.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Main.class)
public class ExampleMixin {
    @Inject(method = "main", at = @At("RETURN"))
    private static void injectT(String[] args, CallbackInfo ci){
        //start copying the jar
        System.out.println("Hello from Canvas!!!");

        //run the rest of the mc code...
    }
}
