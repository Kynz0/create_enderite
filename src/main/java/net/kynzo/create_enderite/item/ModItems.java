package net.kynzo.create_enderite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.kynzo.create_enderite.CreateEnderite;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItems {

    public static void registerModItems() {
        CreateEnderite.LOGGER.info("Registering Mod Items for " + CreateEnderite.MOD_ID);
    }
}
