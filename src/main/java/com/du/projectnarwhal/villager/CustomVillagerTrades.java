package com.du.projectnarwhal.villager;

import com.du.projectnarwhal.init.PNarwhalItems;
import com.google.common.collect.ImmutableMap;
import io.github.vampirestudios.vampirelib.api.custom_villagers.TradeOfferFactories;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffers;

public class CustomVillagerTrades {

    public static void init() {
        TradeOffers.PROFESSION_TO_LEVELED_TRADE.put(PNarwhalVillagers.DOCTOR, TradeOfferFactories.TradingUtils.copyToFastUtilMap(
                ImmutableMap.of(
                        1, new TradeOffers.Factory[]{
                                new TradeOfferFactories.BuyItemFactory(PNarwhalItems.PILL_ITEM, 10, 25, 2),
                                new TradeOfferFactories.BuyItemFactory(PNarwhalItems.MEDICINE_ITEM, 10, 25, 2)
                        }
                )
        ));

    }

}
