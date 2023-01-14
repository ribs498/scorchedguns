package net.ribs.sc.scorchedguns.client;


import com.mrcrayfish.guns.client.render.gun.ModelOverrides;
import net.ribs.sc.scorchedguns.client.render.gun.model.BasicSightModel;

import net.ribs.sc.scorchedguns.core.registry.ItemRegistry;

public class ClientHandler {
    public static void registerModelOverrides() {

        ModelOverrides.register(ItemRegistry.BASIC_SIGHT.get(), new BasicSightModel());

    }
}
