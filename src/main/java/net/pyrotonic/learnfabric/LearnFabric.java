package net.pyrotonic.learnfabric;

import net.fabricmc.api.ModInitializer;

import net.pyrotonic.learnfabric.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnFabric implements ModInitializer {
	public static final String MOD_ID = "learnFabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello modding world!");
		ModItems.registerModItems();
	}
}