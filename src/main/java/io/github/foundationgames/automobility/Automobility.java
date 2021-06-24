package io.github.foundationgames.automobility;

import io.github.foundationgames.automobility.block.AutomobilityBlocks;
import io.github.foundationgames.automobility.entity.AutomobilityEntities;
import io.github.foundationgames.automobility.item.AutomobilityItems;
import io.github.foundationgames.automobility.util.lambdacontrols.AutomobilityLC;
import io.github.foundationgames.automobility.util.lambdacontrols.ControllerUtils;
import io.github.foundationgames.automobility.util.network.PayloadPackets;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Automobility implements ModInitializer {

    public static final String MOD_ID = "automobility";

    @Override
    public void onInitialize() {
        AutomobilityBlocks.init();
        AutomobilityItems.init();
        AutomobilityEntities.init();
        PayloadPackets.init();

        if (ControllerUtils.isLCLoaded()) AutomobilityLC.init();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
