package com.moongaka.tutorialmod.item;

import com.moongaka.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class ModItem {
    public static final Item PINK_GARNET = registerItem(new Item(new Item.Settings()));

    private static Item registerItem(Item ignoredItem) {
        return null;
    }


    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items For " + TutorialMod.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(PINK_GARNET));
    }

}
