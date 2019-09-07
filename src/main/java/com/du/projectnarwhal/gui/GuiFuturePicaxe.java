package com.du.projectnarwhal.gui;

import io.github.cottonmc.cotton.gui.client.BackgroundPainter;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.*;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;
import net.minecraft.util.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;

import javax.swing.text.Position;

import static com.du.projectnarwhal.ProjectNarwhal.SPAWN_TNT;
import static org.lwjgl.BufferUtils.createByteBuffer;

public class GuiFuturePicaxe extends LightweightGuiDescription {

    public GuiFuturePicaxe(World world_1,  PlayerEntity playerEntity_1) {
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

        button.setOnClick( ()->{
            ClientSidePacketRegistry.INSTANCE.sendToServer(SPAWN_TNT, new PacketByteBuf(Unpooled.buffer()));


//            PlayerEntity player = playerEntity_1;
//
//            double x = player.getPos().getX();
//            double y = player.getPos().getY();
//            double z = player.getPos().getZ();
//
//            TntEntity tnt = new TntEntity( world_1, x, y, z , null);
//            world_1.spawnEntity( tnt );
//            tnt.setFuse(40);
        });




    }

    }
