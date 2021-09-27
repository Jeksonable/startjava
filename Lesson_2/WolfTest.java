public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "самец";
        wolf.nickname = "Альфа";
        wolf.weight = 48.7;
        wolf.age = 6;
        wolf.color = "черный";

        System.out.println("Перед нами " + wolf.sex + " волка по кличке " + wolf.nickname + ".");
        System.out.println("Возраст составляет " + wolf.age + " лет, вес - " + wolf.weight + "кг, цвет - " + wolf.color + ".");
        System.out.println("Животное сначала " + wolf.sit() + ", потом " + wolf.walk() + ", а затем " + wolf.run() + ".");
        System.out.println("После этого волк " + wolf.howl() + " и " + wolf.hunt() + ".");
    }
}