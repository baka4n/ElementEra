package com.baka4n.elementera.api.items;

import com.baka4n.elementera.api.reg.RegGroup;
import net.minecraft.item.Item;

public class Deuterium extends Item {
    public Deuterium() {
        super(new Item.Properties()
                .maxStackSize(16).group(RegGroup.gas));
    }

}
