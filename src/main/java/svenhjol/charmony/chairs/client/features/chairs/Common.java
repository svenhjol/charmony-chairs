package svenhjol.charmony.chairs.client.features.chairs;

import svenhjol.charmony.chairs.common.features.chairs.Chairs;
import svenhjol.charmony.chairs.common.features.chairs.Registers;

public class Common {
    public final Registers registers;

    public Common() {
        var common = Chairs.feature();
        registers = common.registers;
    }
}
