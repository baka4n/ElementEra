package com.baka4n.elementera;

import com.baka4n.elementera.api.proxy.Clientproxies;
import com.baka4n.elementera.api.proxy.Iproxies;
import com.baka4n.elementera.api.proxy.Serverproxies;
import com.baka4n.elementera.api.reg.RegItem;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.baka4n.elementera.api.Psf.LOGGER;
import static com.baka4n.elementera.api.Psf.MOD_ID;


@Mod(MOD_ID)
public class ElementEra
{
    public static Iproxies proxy = DistExecutor.runForDist(() -> () -> new Clientproxies(), () -> () -> new Serverproxies());

    public ElementEra() {
        // TODO: 2020/4/5 总注册类
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        RegItem.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // TODO: 2020/4/5 注册事件
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("success!");
    }

}
