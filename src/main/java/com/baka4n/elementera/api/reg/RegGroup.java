package com.baka4n.elementera.api.reg;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RegGroup {
    public static final ItemGroup gas = new ItemGroup("gas") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegItem.PROTIUM.get());
        }
    };
    public static final ItemGroup metals = new ItemGroup("metals") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegItem.LITHIUM_6.get());
        }
    };
    public static final ItemGroup materials = new ItemGroup("materials") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegItem.BERYLLIUM_7.get());
        }
    };
}
