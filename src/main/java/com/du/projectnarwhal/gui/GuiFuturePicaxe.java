package com.du.projectnarwhal.gui;

import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.TntEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;

import javax.swing.text.Position;

public class GuiFuturePicaxe extends LightweightGuiDescription {

    public GuiFuturePicaxe() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(256, 240);

        WSprite icon = new WSprite(new Identifier("minecraft:textures/item/gunpowder.png"));
        root.add(icon, 5, 3, 1, 1);


        WButton button = new WButton(new LiteralText("TNT"));
        root.add(button, 0, 3, 4, 1);

        WButton button2 = new WButton(new LiteralText("3x3"));
        root.add(button2, 0, 6, 4, 1);

        WButton button3 = new WButton(new LiteralText("6x6"));
        root.add(button3, 0, 9, 4, 1);

        WButton button4 = new WButton(new LiteralText("9x9"));
        root.add(button4, 0, 12, 4, 1);

        WLabel label = new WLabel(new LiteralText("Future Pickaxe"), 0xFFFFFF);
        root.add(label, 0, 0, 2, 1);




    }



//    @Override
//    public void addPainters() {
//        getRootPanel().setBackgroundPainter(BackgroundPainter.VANILLA); //This is done automatically though
//    }

    }
