package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FlyweightPattern.example;

import java.util.HashMap;

public class BulletTypeFactory {
    private static final HashMap<String, BulletType> bulletTypes =new HashMap<>();

    /**
     * Handles the list of bullet types, in order to avoid repetition of objects with the same color
     *
     * @param color color of a new or existing bullet type
     * @return a new BulletType if it's not being previously created
     */
    public static BulletType getBulletType(String color) {
        if (!bulletTypes.containsKey(color))
            bulletTypes.put(color, new BulletType(color));

        return bulletTypes.get(color);
    }
}
