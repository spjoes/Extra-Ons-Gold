package com.du.projectnarwhal.gui;

import com.du.projectnarwhal.ProjectNarwhal;
import com.mojang.blaze3d.platform.GlStateManager;
import io.github.cottonmc.cotton.gui.CottonScreenController;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TexturedButtonWidget;
import net.minecraft.container.BlockContext;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.RecipeType;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;

    public class GuiFuturePicaxe extends CottonScreenController {

        public GuiFuturePicaxe(int syncId, PlayerInventory playerInventory, BlockContext context) {
            super(RecipeType.SMELTING, syncId, playerInventory, getBlockInventory(context), getBlockPropertyDelegate(context));

            WGridPanel rootPanel = (WGridPanel) getRootPanel();

            rootPanel.add(new WLabel(new TranslatableText("Future Pickaxe"), WLabel.DEFAULT_TEXT_COLOR), 0, 0);

            WItemSlot inputSlot = WItemSlot.of(blockInventory, 0);
            rootPanel.add(inputSlot, 4, 1);

            rootPanel.add(this.createPlayerInventoryPanel(), 0, 3);

            rootPanel.validate(this);
        }

        @Override
        public int getCraftingResultSlotIndex() {
            return -1; //There's no real result slot
        }
    }
