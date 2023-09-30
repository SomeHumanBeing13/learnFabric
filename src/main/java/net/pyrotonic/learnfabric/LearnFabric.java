package net.pyrotonic.learnfabric;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pyrotonic.learnfabric.item.buand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LearnFabric implements ModInitializer {
	public static final String MOD_ID = "learnFabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



public static final buand BUAND = new buand(new FabricItemSettings().maxCount(1));
	@Override
	public void onInitialize() {

		LOGGER.info("Hello modding world!");
		Registry.register(Registries.ITEM, new Identifier("learnfabric", "buand"), BUAND);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(Items.FISHING_ROD, BUAND);
		});
	}
}