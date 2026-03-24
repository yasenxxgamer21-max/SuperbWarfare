package com.atsuishio.superbwarfare.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    // السلاح الأساسي (سلاح تجريبي)
    public static final Item TEST_RIFLE = registerItem("test_rifle", new Item(new Item.Properties().stacksTo(1)));
    
    // الطلقات
    public static final Item AMMO_9MM = registerItem("ammo_9mm", new Item(new Item.Properties()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath("superbwarfare", name), item);
    }

    public static void registerModItems() {}
}
