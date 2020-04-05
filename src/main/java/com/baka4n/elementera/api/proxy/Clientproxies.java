package com.baka4n.elementera.api.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class Clientproxies implements Iproxies {

    @Override
    public World getClientWorld() {
        return Minecraft.getInstance().world;
    }
}
