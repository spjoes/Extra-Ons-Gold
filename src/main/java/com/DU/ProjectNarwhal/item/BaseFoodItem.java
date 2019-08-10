package com.du.projectnarwhal.item;

import com.du.projectnarwhal.ProjectNarwhal;
import net.minecraft.item.Item;

public class BaseFoodItem extends Item {
    public BaseFoodItem() {
        super(new Settings().group(ProjectNarwhal.PNARWHAL_TAB));
    }

    public BaseFoodItem(Settings properties) {
        super(properties.group(ProjectNarwhal.PNARWHAL_TAB));
    }
}
