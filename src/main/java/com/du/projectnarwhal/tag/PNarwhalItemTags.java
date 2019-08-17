package com.du.projectnarwhal.tag;

import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagContainer;
import net.minecraft.util.Identifier;

import java.util.Collection;
import java.util.Optional;


public class PNarwhalItemTags {
    private static TagContainer<Item> container = new TagContainer((identifier_1) -> {
        return Optional.empty();
    }, "", false, "");
    private static int latestVersion;
    public static final Tag<Item> STYROFOAM = register("styrofoam");
    public static final Tag<Item> DIRTMATERIAL = register("dirtmaterial");
    public static final Tag<Item> FUTURE = register("future");
    public static final Tag<Item> REDSTONEMATERIAL = register("redstonematerial");


    public static void setContainer(TagContainer<Item> tagContainer_1) {
        container = tagContainer_1;
        ++latestVersion;
    }

    public static TagContainer<Item> getContainer() {
        return container;
    }

    private static Tag<Item> register(String string_1) {
        return new com.du.projectnarwhal.tag.PNarwhalItemTags.CachingTag(new Identifier(string_1));
    }

    public static class CachingTag extends Tag<Item> {
        private int version = -1;
        private Tag<Item> delegate;

        public CachingTag(Identifier identifier_1) {
            super(identifier_1);
        }

        public boolean method_15109(Item item_1) {
            if (this.version != com.du.projectnarwhal.tag.PNarwhalItemTags.latestVersion) {
                this.delegate = com.du.projectnarwhal.tag.PNarwhalItemTags.container.getOrCreate(this.getId());
                this.version = com.du.projectnarwhal.tag.PNarwhalItemTags.latestVersion;
            }

            return this.delegate.contains(item_1);
        }

        public Collection<Item> values() {
            if (this.version != com.du.projectnarwhal.tag.PNarwhalItemTags.latestVersion) {
                this.delegate =com.du.projectnarwhal.tag.PNarwhalItemTags.container.getOrCreate(this.getId());
                this.version = com.du.projectnarwhal.tag.PNarwhalItemTags.latestVersion;
            }

            return this.delegate.values();
        }

        public Collection<Entry<Item>> entries() {
            if (this.version != com.du.projectnarwhal.tag.PNarwhalItemTags.latestVersion) {
                this.delegate = com.du.projectnarwhal.tag.PNarwhalItemTags.container.getOrCreate(this.getId());
                this.version = com.du.projectnarwhal.tag.PNarwhalItemTags.latestVersion;
            }

            return this.delegate.entries();
        }
    }
}