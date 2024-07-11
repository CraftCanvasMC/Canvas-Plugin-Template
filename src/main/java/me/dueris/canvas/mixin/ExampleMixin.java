package me.dueris.canvas.mixin;

import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.server.MinecraftServer.class)
public class ExampleMixin {
    @Shadow @Final public static Logger LOGGER;

    @Inject(method = "getServerModName", at = @At("HEAD"), cancellable = true)
    // Specifies what method to inject into
    private void injected(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("Testttt");
    }

    @Inject(method = "runServer", at = @At("HEAD"), cancellable = true)
    private void helloWorld(CallbackInfo ci) {
        LOGGER.info("Hello world! Starting the server right now, have fun!");
    }
}
