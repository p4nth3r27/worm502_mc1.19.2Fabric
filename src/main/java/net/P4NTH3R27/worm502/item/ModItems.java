package net.P4NTH3R27.worm502.item;

import net.P4NTH3R27.worm502.Worm502;
import net.P4NTH3R27.worm502.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final  Item WORM502_DISC = registerItem("worm502_disc",
            new MusicDiscItem(7, ModSounds.WORM502,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1),103));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Worm502.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Worm502.LOGGER.debug("Worming into the galaxy.... " + Worm502.MOD_ID + " One wriggle at a time....");
    }
}
