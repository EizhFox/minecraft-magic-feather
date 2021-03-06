package be.ephys.magicfeather;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = MagicFeatherMod.MODID,
        version = MagicFeatherMod.VERSION,
        name = MagicFeatherMod.NAME
)
public class MagicFeatherMod {
    public static final String MODID = "magicfeather";
    public static final String VERSION = "2.0.1";
    public static final String NAME = "Magic Feather";

    @Mod.Instance
    public static MagicFeatherMod instance;

    @SidedProxy(clientSide = "be.ephys.magicfeather.ClientProxy", serverSide = "be.ephys.magicfeather.ServerProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
