package net.ribs.sc.scorchedguns.core;


import com.mrcrayfish.guns.client.CustomGunManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.NonNullList;
import net.ribs.sc.scorchedguns.core.item.ScorchedGunItem;
import net.ribs.sc.scorchedguns.core.registry.ItemRegistry;

/**
 * Author: Autovw
 */
public class ScorchedGunsTab extends CreativeModeTab {
    public ScorchedGunsTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        ScorchedGunItem gunItem = (ScorchedGunItem) ItemRegistry.SCFUSILAGE.get();
        ItemStack stack = gunItem.getDefaultInstance();
        stack.getOrCreateTag().putInt("AmmoCount", gunItem.getGun().getGeneral().getMaxAmmo());
        return stack;
    }

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {
        super.fillItemList(items);
        CustomGunManager.fill(items);
    }
}
