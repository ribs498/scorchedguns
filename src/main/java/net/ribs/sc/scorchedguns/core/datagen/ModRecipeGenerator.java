package net.ribs.sc.scorchedguns.core.datagen;



import com.mrcrayfish.guns.crafting.WorkbenchIngredient;
import com.mrcrayfish.guns.crafting.WorkbenchRecipeBuilder;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.RegistryObject;
import net.ribs.sc.scorchedguns.core.registry.ItemRegistry;

import java.util.function.Consumer;

import static net.ribs.sc.scorchedguns.core.registry.ItemRegistry.SCORCHEDBRONZEINGOT;
public class ModRecipeGenerator extends RecipeProvider {

    public ModRecipeGenerator(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {


    }}


