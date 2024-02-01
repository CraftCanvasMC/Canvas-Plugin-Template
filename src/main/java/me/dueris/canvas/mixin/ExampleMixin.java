package me.dueris.canvas.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.server.MinecraftServer.class)
public class ExampleMixin {
    @Inject(method = "getServerModName", at = @At("HEAD"), cancellable = true)
    // Specifies what method to inject into
    private void injected(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("Testttt");
    }
}
