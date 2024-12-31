package svenhjol.charmony.chairs.integration;

import svenhjol.charmony.chairs.ChairsMod;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.integration.BaseModMenuPlugin;

public class ModMenuPlugin extends BaseModMenuPlugin {
    @Override
    public Mod mod() {
        return ChairsMod.instance();
    }
}
