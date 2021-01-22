package net.romvoid95.coordless;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Coordless.MODID, name = Coordless.NAME, version = Coordless.VERSION)
public class Coordless
{
    public static final String MODID = "coordless";
    public static final String NAME = "Coordless";
    public static final String VERSION = "0.1.0_BETA";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }
}
