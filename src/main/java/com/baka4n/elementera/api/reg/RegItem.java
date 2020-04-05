package com.baka4n.elementera.api.reg;

import com.baka4n.elementera.api.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.baka4n.elementera.api.Psf.MOD_ID;

public class RegItem {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MOD_ID);
    public static final RegistryObject<Item> PROTIUM = ITEMS.register("protium", Protium::new);
    public static final RegistryObject<Item> DEUTERIUM = ITEMS.register("deuterium", Deuterium::new);
    public static final RegistryObject<Item> TRITIUM = ITEMS.register("tritium", Tritium::new);
    public static final RegistryObject<Item> HELIUM_2 = ITEMS.register("helium_2", Helium::new);
    public static final RegistryObject<Item> HELIUM_3 = ITEMS.register("helium_3", Helium::new);
    public static final RegistryObject<Item> HELIUM = ITEMS.register("helium", Helium::new);
    public static final RegistryObject<Item> HELIUM_5 = ITEMS.register("helium_5", Helium::new);
    public static final RegistryObject<Item> HELIUM_6 = ITEMS.register("helium_6", Helium::new);
    public static final RegistryObject<Item> HELIUM_7 = ITEMS.register("helium_7", Helium::new);
    public static final RegistryObject<Item> HELIUM_8 = ITEMS.register("helium_8", Helium::new);
    public static final RegistryObject<Item> HELIUM_9 = ITEMS.register("helium_9", Helium::new);
    public static final RegistryObject<Item> HELIUM_10 = ITEMS.register("helium_10", Helium::new);
    public static final RegistryObject<Item> LITHIUM_6 = ITEMS.register("lithium_6", Lithium::new);
    public static final RegistryObject<Item> LITHIUM = ITEMS.register("lithium", Lithium::new);
    public static final RegistryObject<Item> BERYLLIUM_7 = ITEMS.register("beryllium_7", Beryllium::new);
    public static final RegistryObject<Item> BERYLLIUM = ITEMS.register("beryllium", Beryllium::new);
    public static final RegistryObject<Item> BERYLLIUM_9 = ITEMS.register("beryllium_9", Beryllium::new);
    public static final RegistryObject<Item> BERYLLIUM_10 = ITEMS.register("beryllium_10", Beryllium::new);

}
