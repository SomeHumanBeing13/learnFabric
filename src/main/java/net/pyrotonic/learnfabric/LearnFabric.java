package net.pyrotonic.learnfabric;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnFabric implements ModInitializer {
	public static final String MOD_ID = "learnFabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

public static final Item BUAND = new Item(new FabricItemSettings());
	@Override
	public void onInitialize() {

		LOGGER.info("Hello modding world!");
		Registry.register(Registries.ITEM, new Identifier("learnfabric", "buand"), BUAND);
	}
}