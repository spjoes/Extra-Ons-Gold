package com.du.projectnarwhal.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class GuiFuturePicaxe extends Screen {

    public GuiFuturePicaxe(Text text_1) {
        super(text_1);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public void render(int int_1, int int_2, float float_1) {
        minecraft.getTextureManager().bindTexture(Window.WINDOW_GUI);
        super.render(int_1, int_2, float_1);
    }


}
