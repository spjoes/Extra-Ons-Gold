package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ProjectNarwhal;

import net.minecraft.item.Item;

public class BaseItem extends Item {
    public BaseItem() {
        super(new Settings().group(ProjectNarwhal.PNARWHAL_TAB));
    }

    public BaseItem(Settings properties) {
        super(properties.group(ProjectNarwhal.PNARWHAL_TAB));
    }
}
