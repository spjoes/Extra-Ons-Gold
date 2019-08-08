package com.DU.ProjectNarwhal.item;

import com.DU.ProjectNarwhal.ProjectNarwhal;
import net.minecraft.item.Item;

public class BaseItem extends Item {
    public BaseItem() {
        super(new Settings().group(ProjectNarwhal.PNARWHAL_TAB));
    }

    public BaseItem(Settings properties) {
        super(properties.group(ProjectNarwhal.PNARWHAL_TAB));
    }
}
