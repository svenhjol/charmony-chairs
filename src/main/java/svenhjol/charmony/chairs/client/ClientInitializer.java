package svenhjol.charmony.chairs.client;

import net.fabricmc.api.ClientModInitializer;
import svenhjol.charmony.chairs.ChairsMod;
import svenhjol.charmony.chairs.client.features.chairs.Chairs;
import svenhjol.charmony.core.enums.Side;

public final class ClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Ensure charmony is launched first.
        svenhjol.charmony.core.client.ClientInitializer.init();

        // Prepare and run the mod.
        var mod = ChairsMod.instance();
        mod.addSidedFeature(Chairs.class);
        mod.run(Side.Client);
    }
}
