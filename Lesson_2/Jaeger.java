public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strength;
    private int armor;
    private boolean destroyed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public void drift() {
        System.out.println("Экипаж робота " + modelName + " входит в дрифт.");
    }

    public String move() {
        return "Начинаем движение!";
    }

    public String scanKaiju() {
        return "Сканирую!";
    }

    public void useCannon() {
        System.out.println("Орудия к бою!");
    }

    public void compareStrength(int strength) {
        if (this.strength < strength) {
            System.out.println("Егерь " + modelName + " слабее!");
        } else if (this.strength > strength) {
            System.out.println("Егерь " + modelName + " сильнее!");
        } else {
            System.out.println("Роботы равны по силе.");
        }
    }

    public void compareArmor(int armor) {
        if (this.armor < armor) {
            System.out.println("Егерь " + modelName + " слабее бронирован!");
        } else if (this.armor > armor) {
            System.out.println("Егерь " + modelName + " сильнее бронирован!");
        } else {
            System.out.println("Роботы одинаково защищены.");
        }
    }

    public void destroy() {
        System.out.println("Кайдзю уничтожил егеря " + modelName + "!");
        destroyed = true;
    }
}