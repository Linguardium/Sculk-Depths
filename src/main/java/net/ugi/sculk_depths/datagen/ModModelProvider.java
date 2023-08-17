package net.ugi.sculk_depths.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.ugi.sculk_depths.block.ModBlocks;
import net.ugi.sculk_depths.item.ModItems;
import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        /*
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
         */
        BlockStateModelGenerator.BlockTexturePool valtroxPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VALTROX_PLANKS);
        BlockStateModelGenerator.BlockTexturePool driedValtroxPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRIED_VALTROX_PLANKS);
        BlockStateModelGenerator.BlockTexturePool petrifiedValtroxPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PETRIFIED_VALTROX_SLATES);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PENEBRIUM_SHINE_SHROOM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PENEBRIUM_SHINE_SHROOM_SPORE_BLOCK);

        valtroxPool.fenceGate(ModBlocks.VALTROX_FENCE_GATE);
        valtroxPool.sign(ModBlocks.VALTROX_SIGN);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_VALTROX_LOG, ModBlocks.VALTROX_HANGING_SIGN, ModBlocks.VALTROX_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerDoor(ModBlocks.VALTROX_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.VALTROX_TRAPDOOR);

        driedValtroxPool.fenceGate(ModBlocks.DRIED_VALTROX_FENCE_GATE);
        //driedValtroxPool.sign(ModBlocks.DRIED_VALTROX_SIGN);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_DRIED_VALTROX_LOG, ModBlocks.DRIED_VALTROX_HANGING_SIGN, ModBlocks.DRIED_VALTROX_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerDoor(ModBlocks.DRIED_VALTROX_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DRIED_VALTROX_TRAPDOOR);

        petrifiedValtroxPool.fenceGate(ModBlocks.PETRIFIED_VALTROX_GATE);
        //petrifiedValtroxPool.sign(ModBlocks.PETRIFIED_VALTROX_SIGN);
        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_PETRIFIED_VALTROX_LOG, ModBlocks.PETRIFIED_VALTROX_HANGING_SIGN, ModBlocks.PETRIFIED_VALTROX_WALL_HANGING_SIGN);
        blockStateModelGenerator.registerDoor(ModBlocks.PETRIFIED_VALTROX_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PETRIFIED_VALTROX_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /*
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
         */
        itemModelGenerator.register(ModItems.CRUX, Models.GENERATED);
    }
}