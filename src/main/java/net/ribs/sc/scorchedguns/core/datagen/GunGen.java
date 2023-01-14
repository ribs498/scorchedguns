package net.ribs.sc.scorchedguns.core.datagen;

import com.mrcrayfish.guns.Reference;
import com.mrcrayfish.guns.common.GripType;
import com.mrcrayfish.guns.common.Gun;
import com.mrcrayfish.guns.datagen.GunProvider;
import com.mrcrayfish.guns.init.ModItems;
import com.mrcrayfish.guns.init.ModSounds;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;

/**
 * Author: MrCrayfish
 */
public class GunGen extends GunProvider
{
    public GunGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerGuns()
    {
        this.addGun(new ResourceLocation(Reference.MOD_ID, "volley_gun"), Gun.Builder.create()
                .setAuto(true)
                .setFireRate(2)
                .setGripType(GripType.MINI_GUN)
                .setMaxAmmo(100)
                .setReloadAmount(10)
                .setRecoilAngle(1.0F)
                .setAlwaysSpread(true)
                .setSpread(7.0F)
                .setAmmo(ModItems.BASIC_BULLET.get())
                .setDamage(5.0F)
                .setProjectileSize(0.2F)
                .setProjectileSpeed(8.0F)
                .setProjectileLife(30)
                .setFireSound(ModSounds.ITEM_MINI_GUN_FIRE.get())
                .setReloadSound(ModSounds.ITEM_PISTOL_RELOAD.get())
                .setEnchantedFireSound(ModSounds.ITEM_MINI_GUN_ENCHANTED_FIRE.get())
                .setMuzzleFlash(0.5, 0.0, 2.7, -11.51)
                .build());






    }
}
