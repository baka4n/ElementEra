package com.baka4n.elementera.api.items;

import com.baka4n.elementera.api.reg.RegGroup;
import net.minecraft.item.Item;


public class Nitrogen extends Item {
    public Nitrogen() {
        super(new Properties()
                .maxStackSize(16)
                .group(RegGroup.gas));
    }
}
