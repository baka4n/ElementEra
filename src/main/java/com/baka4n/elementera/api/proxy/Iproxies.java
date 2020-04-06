package com.baka4n.elementera.api.proxy;

import com.baka4n.elementera.api.Psf;

import com.baka4n.elementera.api.reg.RegItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// TODO: 2020/4/6 代理proxy
public class Iproxies {
    public Iproxies() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Iproxies::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Iproxies::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(Iproxies::processIMC);

        RegItem.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.addListener(Iproxies::serverStarting);
    }
    private static void commonSetup(FMLCommonSetupEvent event) {
        Psf.LOGGER.debug("common setup event!");
    }

    private static void serverStarting(FMLServerStartingEvent event) {

    }

    private static void enqueueIMC(final InterModEnqueueEvent event) {
    }

    private static void processIMC(final InterModProcessEvent event) {

    }
}
