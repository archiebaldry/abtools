package xyz.archiebaldry.abtools.mixin;

import xyz.archiebaldry.abtools.Abtools;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class AbtoolsMixin {

	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Abtools.LOGGER.info("This line is printed by the abtools mixin!");
	}

}
