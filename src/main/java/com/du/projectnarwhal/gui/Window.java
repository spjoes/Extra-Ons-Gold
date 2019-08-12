package com.du.projectnarwhal.gui;

import com.du.projectnarwhal.ProjectNarwhal;
import net.minecraft.util.Identifier;

public class Window <T extends Wrappable>{

    public static final Identifier WINDOW_GUI = new Identifier(ProjectNarwhal.MOD_ID, "textures/gui/future-picaxe.png");

    private Window<? extends Wrappable> parent = null;


}
