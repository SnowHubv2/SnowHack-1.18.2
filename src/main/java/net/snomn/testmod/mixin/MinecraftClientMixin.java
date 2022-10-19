package net.snomn.testmod.mixin;

import net.minecraft.client.MinecraftClient;
import net.snomn.testmod.TestMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    public void onTick(CallbackInfo ci){
        TestMod.INSTANCE.LOGGER.info("Ticking");
    }
}
