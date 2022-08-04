package xyz.archiebaldry.abtools;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Abtools implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("abtools");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
