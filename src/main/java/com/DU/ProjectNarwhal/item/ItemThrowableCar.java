package com.DU.ProjectNarwhal.item;


import com.DU.ProjectNarwhal.ProjectNarwhal;
import net.minecraft.item.Item;
import net.minecraft.item.TridentItem;

public class ItemThrowableCar extends TridentItem {

    public ItemThrowableCar() {
        super(new Item.Settings().maxCount(1).group(ProjectNarwhal.PNARWHAL_TAB));

    }

}