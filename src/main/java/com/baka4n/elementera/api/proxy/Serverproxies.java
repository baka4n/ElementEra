package com.baka4n.elementera.api.proxy;

import net.minecraft.world.World;

public class Serverproxies implements Iproxies {

    @Override
    public World getClientWorld() {
        throw new IllegalStateException("only to client!");
    }
}
