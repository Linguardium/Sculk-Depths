package net.ugi.sculk_depths.portal;


import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;
import net.ugi.sculk_depths.item.ModItems;

public class Portals {
    public static void registerModPortals() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.REINFORCED_DEEPSLATE)
                //.customPortalBlock(Blocks.SCULK)
                .destDimID(new Identifier("sculk_depths:sculk_depthsdim"))
                .tintColor(1, 69, 86)
                .lightWithItem(ModItems.ENERGISED_FLINT_AND_STEEL)
                .setPortalSearchYRange(0, 120)
                .registerIgniteEvent((player, world, portalPos, framePos, portalIgnitionSource) -> {
                    if (portalIgnitionSource.sourceType == PortalIgnitionSource.SourceType.USEITEM && player != null) {
                        if (player.isCreative())
                            return;
                        ItemStack heldItem = player.getMainHandStack().getItem() == ModItems.ENERGISED_FLINT_AND_STEEL ?
                                player.getMainHandStack() : player.getOffHandStack();
                        heldItem.damage(10, player, p -> p.sendToolBreakStatus(player.getActiveHand())); //todo configurable damage
                        //heldItem.setDamage(heldItem.getDamage() + 10); //if above breaks use this with a custom durability check
                    }
                })
                .registerPortal();

    }
}
