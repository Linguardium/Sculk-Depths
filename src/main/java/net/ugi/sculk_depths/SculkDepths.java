package net.ugi.sculk_depths;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.ugi.sculk_depths.block.ModBlockEntities;
import net.ugi.sculk_depths.block.ModBlocks;
import net.ugi.sculk_depths.block.custom.ModCauldron.ModCauldronBehavior;
import net.ugi.sculk_depths.entity.ModEntities;
import net.ugi.sculk_depths.entity.custom.GlomperEntity;
import net.ugi.sculk_depths.item.ModItemGroup;
import net.ugi.sculk_depths.item.ModItems;
import net.ugi.sculk_depths.portal.Portals;
import net.ugi.sculk_depths.recipe.ModRecipes;
import net.ugi.sculk_depths.sound.ModSounds;
import net.ugi.sculk_depths.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SculkDepths implements ModInitializer {
    public static final String MOD_ID = "sculk_depths";
    public static final Logger LOGGER = LoggerFactory.getLogger("sculk_depths");





    @Override
    public void onInitialize() {
        SculkDepths.LOGGER.info("Registering Itemgroups for " + SculkDepths.MOD_ID);
        ModItemGroup.registerItemgroups();
        SculkDepths.LOGGER.info("Registering items for " + SculkDepths.MOD_ID);
        ModItems.registerModItems();
        SculkDepths.LOGGER.info("Registering Blocks for " + SculkDepths.MOD_ID);
        ModBlocks.registerModBlocks();
        SculkDepths.LOGGER.info("Registering Portals for " + SculkDepths.MOD_ID);
        Portals.registerModPortals();
        SculkDepths.LOGGER.info("Registering Sounds for " + SculkDepths.MOD_ID);
        ModSounds.registerModSounds();
        SculkDepths.LOGGER.info("Registering LootTables for " + SculkDepths.MOD_ID);
        ModLootTableModifiers.modifyLootTables();
        SculkDepths.LOGGER.info("Registering ModCauldronBehavior for " + SculkDepths.MOD_ID);
        ModCauldronBehavior.registerBehavior();
        //SculkDepths.LOGGER.info("Registering Recipes for " + SculkDepths.MOD_ID);
        //ModRecipes.register();
        //SculkDepths.LOGGER.info("Registering BlockEntities for " + SculkDepths.MOD_ID);
        //ModBlockEntities.registerBlockEntities();
        SculkDepths.LOGGER.info("Registering Entities for " + SculkDepths.MOD_ID);
        FabricDefaultAttributeRegistry.register(ModEntities.GLOMPER, GlomperEntity.setAttributes());

        LOGGER.info(SculkDepths.MOD_ID + " has loaded");
    }
}
