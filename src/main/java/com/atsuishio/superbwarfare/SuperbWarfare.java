package com.atsuishio.superbwarfare;

import net.fabricmc.api.ModInitializer;
import com.atsuishio.superbwarfare.item.ModItems;

public class SuperbWarfare implements ModInitializer {
    public static final String MOD_ID = "superbwarfare";

    @Override
    public void onInitialize() {
        // تسجيل الأسلحة
        ModItems.registerModItems();
    }
}
