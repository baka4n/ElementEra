package com.baka4n.elementera;

import com.baka4n.elementera.api.proxy.Client;
import com.baka4n.elementera.api.proxy.Server;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import static com.baka4n.elementera.api.Psf.MOD_ID;


@Mod(MOD_ID)
public class ElementEra
{

    public ElementEra() {
        // TODO: 2020/4/6 修改于
        DistExecutor.runForDist(
                () -> () -> new Server(),
                () -> () -> new Client());
    }

}
