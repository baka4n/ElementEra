package com.baka4n.elementera.api.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// TODO: 2020/4/6 客户端代理proxy
public class Client extends Iproxies {
    public Client() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);

    }

    private static void  clientSetup(FMLClientSetupEvent event) {

    }
}
