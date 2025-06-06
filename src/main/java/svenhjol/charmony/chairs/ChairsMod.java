package svenhjol.charmony.chairs;

import net.minecraft.resources.ResourceLocation;
import svenhjol.charmony.api.core.ModDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.api.core.Side;

@ModDefinition(
    id = ChairsMod.ID,
    sides = {Side.Client, Side.Common},
    name = "Chairs",
    description = "Sit down on stair blocks.")
public final class ChairsMod extends Mod {
    public static final String ID = "charmony-chairs";
    private static ChairsMod instance;

    private ChairsMod() {}

    public static ChairsMod instance() {
        if (instance == null) {
            instance = new ChairsMod();
        }
        return instance;
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(ID, path);
    }
}