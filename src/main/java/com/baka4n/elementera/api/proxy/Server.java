package com.baka4n.elementera.api.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// TODO: 2020/4/6 服务端代理proxy
public class Server extends Iproxies {
    public Server() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
    }

    private static void serverSetup(FMLDedicatedServerSetupEvent event) {

    }
}
