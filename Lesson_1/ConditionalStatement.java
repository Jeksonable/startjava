public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        boolean male = true;
        double height = 1.8;
        char firstLetter = 'M';

        if (age > 20) {
            System.out.println("Человек старше 20 лет.");
        }

        if (male) {
            System.out.println("Человек мужского пола");
        }

        if (!male) {
            System.out.println("Человек женского пола");
        }

        if (height < 1.8) {
            System.out.println("Рост не достигает 1.8м.");
        } else {
            System.out.println("Рост равен либо превышает 1.8м.");
        }

        if (firstLetter == 'M') {
            System.out.println("Имя начинается с буквы M.");
        } else if (firstLetter == 'I') {
            System.out.println("Имя начинается с буквы I.");
        } else {
            System.out.println("Имя не начинается с букв M и I.");
        }
    }
}