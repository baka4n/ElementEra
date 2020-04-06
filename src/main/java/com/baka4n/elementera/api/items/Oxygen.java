package com.baka4n.elementera.api.items;

import com.baka4n.elementera.api.reg.RegGroup;
import net.minecraft.item.Item;

public class Oxygen extends Item {
    public Oxygen() {
        super(new Item.Properties()
                .maxStackSize(16)
                .group(RegGroup.gas));
    }
}
