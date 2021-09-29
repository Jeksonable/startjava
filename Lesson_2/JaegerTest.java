public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setOrigin("USA");
        jaeger1.setHeight(79.25f);
        jaeger1.setWeight(1.98f);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.setDestroyed(false);

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Coyote Tango");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("Japan");
        jaeger2.setHeight(85.34f);
        jaeger2.setWeight(2.312f);
        jaeger2.setStrength(7);
        jaeger2.setArmor(4);
        jaeger2.setDestroyed(false);

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