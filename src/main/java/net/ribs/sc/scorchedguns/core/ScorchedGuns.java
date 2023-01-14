package net.ribs.sc.scorchedguns.core;


import com.mrcrayfish.guns.client.KeyBinds;
import com.mrcrayfish.guns.client.SpecialModels;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.ribs.sc.scorchedguns.core.config.Config;

import net.ribs.sc.scorchedguns.core.datagen.ModRecipeGenerator;
import net.ribs.sc.scorchedguns.core.registry.ItemRegistry;
import net.ribs.sc.scorchedguns.core.registry.SoundRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(ScorchedGuns.ID)
public class ScorchedGuns {
    public static final String ID = "scorchedguns";
    public static final CreativeModeTab GROUP = new ScorchedGunsTab(ID);

    public ScorchedGuns() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.clientConfig);


        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
        ItemRegistry.ITEMS.register(bus);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.register(this);


        SoundRegistry.SOUNDS.register(bus);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            bus.addListener(KeyBinds::registerKeyMappings);
            bus.addListener(SpecialModels::registerAdditional);
        });

        bus.addListener(this::gatherData);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(event.includeServer(), new ModRecipeGenerator(generator));
    }
}
