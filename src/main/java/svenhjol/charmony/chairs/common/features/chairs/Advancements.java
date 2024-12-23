package svenhjol.charmony.chairs.common.features.chairs;

import net.minecraft.world.entity.player.Player;
import svenhjol.charmony.core.base.Setup;
import svenhjol.charmony.core.helper.AdvancementHelper;

public final class Advancements extends Setup<Chairs> {
    public Advancements(Chairs feature) {
        super(feature);
    }

    public void satOnChair(Player player) {
        AdvancementHelper.trigger("sat_on_chair", player);
    }
}
