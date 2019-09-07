package com.du.projectnarwhal.item;


import com.du.projectnarwhal.ProjectNarwhal;
import com.du.projectnarwhal.gui.GuiFuturePicaxe;
import com.du.projectnarwhal.gui.GuiGeneratorFuturePickaxe;
import com.google.common.collect.Lists;
import io.github.cottonmc.cotton.gui.client.ClientCottonScreen;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.*;
import net.minecraft.world.World;
import  net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.ActionResult;

import java.util.Iterator;
import java.util.List;

import static net.minecraft.potion.PotionUtil.getPotionEffects;


public class ItemFuturePicaxe extends PickaxeItem {




    public ItemFuturePicaxe(ToolMaterial toolMaterial_1, int int_1, float float_1, Settings item$Settings_1) {
        super(toolMaterial_1,int_1, float_1, item$Settings_1.group(ProjectNarwhal.PNARWHAL_TAB));

    }

    @Override
    public TypedActionResult<ItemStack> use(World world_1, PlayerEntity playerEntity_1, Hand hand_1) {


        if (world_1.isClient) {
            MinecraftClient.getInstance().openScreen(new GuiGeneratorFuturePickaxe(new GuiFuturePicaxe(world_1, playerEntity_1)));
        } else {
            return super.use(world_1, playerEntity_1, hand_1);
        }

        return super.use(world_1, playerEntity_1, hand_1);

    }



    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(itemStack, world, tooltip, tooltipContext);
        tooltip.add((new LiteralText("The Pickaxe Of The Future!")).formatted(Formatting.GRAY));
    }




    public boolean isEffectiveOn(BlockState blockState_1) {
        Block block_1 = blockState_1.getBlock();
        int int_1 = this.getMaterial().getMiningLevel();
        if (block_1 == Blocks.OBSIDIAN) {
            return int_1 == 3;
        } else if (block_1 != Blocks.DIAMOND_BLOCK && block_1 != Blocks.DIAMOND_ORE && block_1 != Blocks.EMERALD_ORE && block_1 != Blocks.EMERALD_BLOCK && block_1 != Blocks.GOLD_BLOCK && block_1 != Blocks.GOLD_ORE && block_1 != Blocks.REDSTONE_ORE) {
            if (block_1 != Blocks.IRON_BLOCK && block_1 != Blocks.IRON_ORE && block_1 != Blocks.LAPIS_BLOCK && block_1 != Blocks.LAPIS_ORE) {
                Material material_1 = blockState_1.getMaterial();
                return material_1 == Material.STONE || material_1 == Material.METAL || material_1 == Material.ANVIL;
            } else {
                return int_1 >= 1;
            }
        } else {
            return int_1 >= 2;
        }
    }

    public float getMiningSpeed(ItemStack itemStack_1, BlockState blockState_1) {
        Material material_1 = blockState_1.getMaterial();
        return material_1 != Material.METAL && material_1 != Material.ANVIL && material_1 != Material.STONE ? super.getMiningSpeed(itemStack_1, blockState_1) : this.miningSpeed;
    }


}
