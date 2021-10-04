package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 8, 6, false);
        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 7, 4, false);

        jaeger1.drift();
        jaeger2.drift();
        System.out.println(jaeger1.getModelName() + " - " + jaeger1.move());
        System.out.println(jaeger2.getModelName() + " - " + jaeger2.scanKaiju());
        jaeger1.useCannon();
        jaeger2.useCannon();
        jaeger1.compareStrength(jaeger2.getStrength());
        jaeger1.setStrength(7);
        jaeger1.compareStrength(jaeger2.getStrength());
        jaeger2.compareArmor(jaeger1.getArmor());
        jaeger2.setArmor(7);
        jaeger2.compareArmor(jaeger1.getArmor());
        jaeger1.destroy();
        jaeger2.destroy();
        System.out.println("Робот " + jaeger1.getModelName() + " уничтожен? " + jaeger1.isDestroyed());
        System.out.println("Робот " + jaeger2.getModelName() + " уничтожен? " + jaeger2.isDestroyed());
    }
}