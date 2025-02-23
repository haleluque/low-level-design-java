package com.haleluque.low.level.design.design.patterns.StructuralPatterns.FlyweightPattern.example;

class Bullet {
    private final int x, y;  // Extrinsic properties unique to each bullet
    private final int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        //Share prop
        BulletType type = BulletTypeFactory.getBulletType(color); //we manage the sharing of similar BulletType objects
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity + " and color: " + type.getColor());
    }
    public void display() {
        System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity " + velocity);
    }
}
