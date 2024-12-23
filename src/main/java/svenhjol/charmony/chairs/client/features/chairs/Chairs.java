package svenhjol.charmony.chairs.client.features.chairs;

import svenhjol.charmony.core.annotations.FeatureDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.base.SidedFeature;
import svenhjol.charmony.core.enums.Side;

import java.util.function.Supplier;

@FeatureDefinition(side = Side.Client, showInConfig = false)
public final class Chairs extends SidedFeature {
    public final Supplier<Common> common;
    public final Registers registers;

    public Chairs(Mod mod) {
        super(mod);
        common = Common::new;
        registers = new Registers(this);
    }
}
