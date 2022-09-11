package net.P4NTH3R27.worm502;

import net.P4NTH3R27.worm502.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Worm502 implements ModInitializer {
	public static final String MOD_ID = "worm502";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
