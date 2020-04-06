package com.baka4n.elementera.api.proxy;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class Client extends Iproxies {
    public Client() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);

    }

    private static void  clientSetup(FMLClientSetupEvent event) {

    }
}
