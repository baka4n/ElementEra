package com.baka4n.elementera.api.items;

import com.baka4n.elementera.api.reg.RegGroup;
import net.minecraft.item.Item;

public class Boron extends Item {
    public Boron() {
        super(new Item.Properties()
                .maxStackSize(16).group(RegGroup.materials));
    }
}
