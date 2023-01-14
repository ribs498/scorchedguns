package net.ribs.sc.scorchedguns.core.registry;


import net.minecraft.world.item.*;
import net.ribs.sc.scorchedguns.core.ScorchedGuns;
import net.ribs.sc.scorchedguns.core.item.ScorchedGunItem;
import com.mrcrayfish.guns.common.GunModifiers;
import com.mrcrayfish.guns.item.*;
import com.mrcrayfish.guns.item.attachment.impl.Barrel;
import com.mrcrayfish.guns.item.attachment.impl.Scope;
import com.mrcrayfish.guns.item.attachment.impl.Stock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


//CLASS FOR REGISTERING GUNS
public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScorchedGuns.ID);


    public static final Item.Properties genericProperties = new Item.Properties().stacksTo(1).tab(ScorchedGuns.GROUP);

    /* Guns */
    public static final RegistryObject<Item> EOKAPISTOL = registerGun("eoka_pistol", false);
    public static final RegistryObject<Item> PIPEMUSKET = registerGun("pipe_musket", false);
    public static final RegistryObject<Item> HANDCROSSBOW = registerGun("hand_crossbow", false);
    public static final RegistryObject<Item> AUTOCROSSBOW = registerGun("auto_crossbow", false);
    public static final RegistryObject<Item> SCRAPCANNON = registerGun("scrap_cannon", false);
    public static final RegistryObject<Item> BLUNDERBUSS = registerGun("blunderbuss", false);
    public static final RegistryObject<Item> SCRAPPISTOL = registerGun("scrap_pistol", false);
    public static final RegistryObject<Item> BASTARD_GUN = registerGun("bastard_gun", false);
    public static final RegistryObject<Item> VOLLEY_GUN = registerGun("volley_gun", false);
    public static final RegistryObject<Item> FLECHETTEJET = registerGun("flechette_jet", false);
    public static final RegistryObject<Item> M12WALTZ = registerGun("m12_waltz", false);
    public static final RegistryObject<Item> WALTZCONVERSION = registerGun("waltz_conversion", false);
    public static final RegistryObject<Item> STEYRSMG = registerGun("steyr_smg", false);
    public static final RegistryObject<Item> SCATTERGUN = registerGun("scattergun", false);
    public static final RegistryObject<Item> CARABINE_44 = registerGun("carabine_44", false);
    public static final RegistryObject<Item> KILNGUN = registerGun("kiln_gun", false);
    public static final RegistryObject<Item> PUNTGUN = registerGun("punt_gun", false);
    public static final RegistryObject<Item> SCORCHEDWAND = registerGun("scorched_wand", false);
    public static final RegistryObject<Item> SCORCHEDSTAFF = registerGun("scorched_staff", false);
    public static final RegistryObject<Item> SCORCHEDOBREZSTAFF = registerGun("scorched_obrez_staff", false);
    public static final RegistryObject<Item> SCORCHEDSCATTERSTAFF = registerGun("scorched_scatter_staff", false);
    public static final RegistryObject<Item> BLASPHEMY = registerGun("blasphemy", false);
    public static final RegistryObject<Item> SCGOWZA = registerGun("sc_gowza", false);
    public static final RegistryObject<Item> SCFUSILAGE = registerGun("sc_fusilage", false);
    public static final RegistryObject<Item> SCDAHKA = registerGun("sc_dahka", false);
    public static final RegistryObject<Item> FRONTIERSIDEARM = registerGun("frontier_sidearm", false);
    public static final RegistryObject<Item> SCLAWBRINGER = registerGun("sc_lawbringer", false);
    public static final RegistryObject<Item> SOULDRUMMER = registerGun("soul_drummer", false);
    public static final RegistryObject<Item> RIVETER = registerGun("riveter", false);
    public static final RegistryObject<Item> JURYRIGGEDWRISTBREAKER = registerGun("jury_rigged_wrist_breaker", false);
    public static final RegistryObject<Item> RAILWORKER = registerGun("railworker", false);
    public static final RegistryObject<Item> GAUSS = registerGun("gauss_rifle", false);
    public static final RegistryObject<Item> COGLOADER = registerGun("cogloader", false);
    public static final RegistryObject<Item> M99KRAUSER = registerGun("m99_krauser", false);
    public static final RegistryObject<Item> JACKHAMMER = registerGun("jackhammer", false);
    public static final RegistryObject<Item> OSGOODFIFTY = registerGun("osgood_50", false);
    public static final RegistryObject<Item> HUOT_AUTO = registerGun("huot_auto", false);
    public static final RegistryObject<Item> THUMPER = registerGun("thumper", false);
    public static final RegistryObject<Item> SPITFIRE = registerGun("spitfire", false);
    public static final RegistryObject<Item> CYCLONE = registerGun("cyclone", false);
    public static final RegistryObject<Item> THUNDERHEAD = registerGun("thunderhead", false);
    public static final RegistryObject<Item> OFFICERS_SPECIAL = registerGun("officers_special", false);
    public static final RegistryObject<Item> COSMICBLITZER = registerGun("cosmic_blitzer", false);
    public static final RegistryObject<Item> R498GAUSSCANNON = registerGun("r498_gauss_cannon", false);
    public static final RegistryObject<Item> ALFONZREPEATINGPUNTER = registerGun("alfonz_repeating_punter", false);
    public static final RegistryObject<Item> ALFONZTURNPIKE = registerGun("alfonz_turnpike", false);
    public static final RegistryObject<Item> LG8GRENADELAUNCHER = registerGun("lg8_grenade_launcher", false);
    public static final RegistryObject<Item> ASTELLA = registerGun("astella", false);
    /* Attachments */
    public static final RegistryObject<Item> WOODEN_STOCK = ITEMS.register("wooden_stock", () -> new StockItem(Stock.create(GunModifiers.STABILISED), genericProperties, false));
    public static final RegistryObject<Item> MUZZLE_BRAKE = ITEMS.register("muzzle_brake", () -> new BarrelItem(Barrel.create(9.5f, GunModifiers.REDUCED_RECOIL), genericProperties, false));
    public static final RegistryObject<Item> ADVANCED_SILENCER = ITEMS.register("advanced_silencer", () -> new BarrelItem(Barrel.create(16.0f, GunModifiers.SILENCED), genericProperties));
    public static final RegistryObject<Item> BASIC_SIGHT = ITEMS.register("basic_sight", () -> new ScopeItem(Scope.create(0.025F, 1.25F, GunModifiers.SLOWER_ADS).viewFinderOffset(0.3), genericProperties, false));

    /* Bullets */
    public static final RegistryObject<Item> POWDERANDBALL = registerMisc("powder_and_ball");
    public static final RegistryObject<Item> SIMPLEBULLET = registerAmmo("simple_bullet");
    public static final RegistryObject<Item> SHOTBOLT = registerAmmo("shotbolt");
    public static final RegistryObject<Item> VOLATILESCRAP = registerAmmo("volatile_scrap");
    public static final RegistryObject<Item> ENCASEDFIRE = registerAmmo("encased_fire");
    public static final RegistryObject<Item> RIVET = registerAmmo("rivet");
    public static final RegistryObject<Item> FLECHETTE = registerAmmo("flechette");
    public static final RegistryObject<Item> FLECHETTEROUND = registerMisc("flechette_round");
    public static final RegistryObject<Item> ECROUND = registerAmmo("ec_round");
    public static final RegistryObject<Item> SCORCHEDBULLET = registerMisc("scorched_bullet");
    public static final RegistryObject<Item> SCORCHEDBIGBULLET = registerMisc("scorched_big_bullet");
    public static final RegistryObject<Item> SCORCHEDSHELL = registerMisc("scorched_shell");
    public static final RegistryObject<Item> HEAVYBULLET = registerAmmo("heavy_bullet");
    public static final RegistryObject<Item> OSBORNESLUG = registerAmmo("osborne_slug");
    public static final RegistryObject<Item> EXPERIMENTALROUND = registerAmmo("experimental_round");
    public static final RegistryObject<Item> ETHEREALBULLET = registerAmmo("ethereal_bullet");
    public static final RegistryObject<Item> ETHEREALHEAVYBULLET = registerAmmo("ethereal_heavy_bullet");
    public static final RegistryObject<Item> ETHEREALSHELL = registerAmmo("ethereal_shell");
    public static final RegistryObject<Item> ETHEREALECROUND = registerAmmo("ethereal_ec_round");



    public static final RegistryObject<Item> TINBRONZEINGOT = registerMisc("tin_bronze_ingot");
    public static final RegistryObject<Item> PUREGUNPOWDER = registerMisc("pure_gunpowder");
    public static final RegistryObject<Item> NITRODUST = registerMisc("nitro_dust");
    public static final RegistryObject<Item> DIAMONDSTEELNUGGET = registerMisc("diamond_steel_nugget");
    public static final RegistryObject<Item> DIAMONDSTEEL = registerMisc("diamond_steel");
    public static final RegistryObject<Item> SCORCHEDBRONZENUGGET = registerMisc("scorched_bronze_nugget");
    public static final RegistryObject<Item> SCORCHEDBRONZEINGOT = registerMisc("scorched_bronze_ingot");


    private static RegistryObject<Item> registerGun(String name, boolean canColor) {
        return ITEMS.register(name, () -> new ScorchedGunItem(genericProperties, canColor));
    }

    private static RegistryObject<Item> registerAmmo(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(ScorchedGuns.GROUP)));
    }

    private static RegistryObject<Item> registerMisc(String name) {
        return ITEMS.register(name, () -> new AmmoItem(new Item.Properties().tab(ScorchedGuns.GROUP)));
    }

    private static Item.Properties props() {
        return new Item.Properties().tab(ScorchedGuns.GROUP);
    }


}










