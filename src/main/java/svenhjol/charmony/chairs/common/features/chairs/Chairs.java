package svenhjol.charmony.chairs.common.features.chairs;

import svenhjol.charmony.core.annotations.FeatureDefinition;
import svenhjol.charmony.core.base.Mod;
import svenhjol.charmony.core.base.SidedFeature;
import svenhjol.charmony.core.enums.Side;

/**
 * Inspired by Quark's SitInStairs module.
 */
@FeatureDefinition(side = Side.Common, description = """
    Right-click (with empty hand) on any stairs block to sit down.""")
public final class Chairs extends SidedFeature {
    public final Advancements advancements;
    public final Registers registers;
    public final Handlers handlers;

    public Chairs(Mod mod) {
        super(mod);

        registers = new Registers(this);
        handlers = new Handlers(this);
        advancements = new Advancements(this);
    }

    public static Chairs feature() {
        return Mod.getSidedFeature(Chairs.class);
    }
}