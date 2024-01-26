package net.kynzo.create_enderite.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class ExampleMixin {
    //no idea why this is here it crashed the game whenever i tried to start it so i just commented it and now it finally works perfectly fine
//	@Inject(at = @At("HEAD"), method = "loadWorld", cancellable = true)
//	private void init(CallbackInfo info) {
//		// This code is injected into the start of MinecraftServer.loadWorld()V
//	}
}