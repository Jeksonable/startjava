public class Wolf {
    private String sex;
    private String nickname;
    private double weight;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String walk() {
        return "идёт";
    }

    public String sit() {
        return "сидит";
    }

    public String run() {
        return "бежит";
    }

    public String howl() {
        return "воет";
    }

    public String hunt() {
        return "охотится";
    }
}