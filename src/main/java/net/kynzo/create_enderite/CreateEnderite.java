package net.kynzo.create_enderite;

import net.fabricmc.api.ModInitializer;

import net.kynzo.create_enderite.item.ModItemGroups;
import net.kynzo.create_enderite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.directory.ModificationItem;

public class CreateEnderite implements ModInitializer {
    public static final String MOD_ID = "create_enderite";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
    }
}