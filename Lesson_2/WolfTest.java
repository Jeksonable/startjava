public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("самец");
        wolf.setNickname("Альфа");
        wolf.setWeight(48.7);
        wolf.setAge(6);
        wolf.setColor("черный");

        System.out.println("Перед нами " + wolf.getSex() + " волка по кличке " + wolf.getNickname() + ".");
        System.out.println("Возраст составляет " + wolf.getAge() + " лет, вес - " + wolf.getWeight() + "кг, цвет - " + wolf.getColor() + ".");
        System.out.println("Животное сначала " + wolf.sit() + ", потом " + wolf.walk() + ", а затем " + wolf.run() + ".");
        System.out.println("После этого волк " + wolf.howl() + " и " + wolf.hunt() + ".");
    }
}