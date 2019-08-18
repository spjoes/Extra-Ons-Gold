package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ProjectNarwhal;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemRedstoneSaber extends SwordItem {

    private final float attackDamage;
    private final float attackSpeed;

    // public ItemRedstoneSaber() {
//        super(new Item.Settings().group(ProjectNarwhal.PNARWHAL_TAB));
//    }


    public ItemRedstoneSaber(ToolMaterial toolMaterial_1, int int_1, float float_1, Settings item$Settings_1) {
        super(toolMaterial_1,int_1, float_1, item$Settings_1.group(ProjectNarwhal.PNARWHAL_TAB));

        this.attackSpeed = float_1;
        this.attackDamage = (float)int_1 + toolMaterial_1.getAttackDamage();

    }


    public float getAttackDamage() {
        return this.attackDamage;
    }

    public boolean canMine(BlockState blockState_1, World world_1, BlockPos blockPos_1, PlayerEntity playerEntity_1) {
        return !playerEntity_1.isCreative();
    }

    public float getMiningSpeed(ItemStack itemStack_1, BlockState blockState_1) {
        Block block_1 = blockState_1.getBlock();
        if (block_1 == Blocks.COBWEB) {
            return 15.0F;
        } else {
            Material material_1 = blockState_1.getMaterial();
            return material_1 != Material.PLANT && material_1 != Material.REPLACEABLE_PLANT && material_1 != Material.UNUSED_PLANT && !blockState_1.matches(BlockTags.LEAVES) && material_1 != Material.PUMPKIN ? 1.0F : 1.5F;
        }
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity livingEntity_1, LivingEntity livingEntity_2) {
        itemStack_1.damage(1, livingEntity_2, (livingEntity_1x) -> {
            livingEntity_1x.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    public boolean postMine(ItemStack itemStack_1, World world_1, BlockState blockState_1, BlockPos blockPos_1, LivingEntity livingEntity_1) {
        if (blockState_1.getHardness(world_1, blockPos_1) != 0.0F) {
            itemStack_1.damage(2, livingEntity_1, (livingEntity_1x) -> {
                livingEntity_1x.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    public boolean isEffectiveOn(BlockState blockState_1) {
        return blockState_1.getBlock() == Blocks.COBWEB;
    }

    public Multimap<String, EntityAttributeModifier> getModifiers(EquipmentSlot equipmentSlot_1) {
        Multimap<String, EntityAttributeModifier> multimap_1 = super.getModifiers(equipmentSlot_1);
        if (equipmentSlot_1 == EquipmentSlot.MAINHAND) {
            multimap_1.put(EntityAttributes.ATTACK_DAMAGE.getId(), new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_UUID, "Weapon modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
            multimap_1.put(EntityAttributes.ATTACK_SPEED.getId(), new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_UUID, "Weapon modifier", (double)this.attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        }

        return multimap_1;
    }

}
