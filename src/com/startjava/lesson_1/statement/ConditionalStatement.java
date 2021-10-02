package com.startjava.lesson_1.statement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("Человек старше 20 лет.");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Человек мужского пола");
        }

        if (!isMale) {
            System.out.println("Человек женского пола");
        }

        double height = 1.8;
        if (height < 1.8) {
            System.out.println("Рост не достигает 1.8м.");
        } else {
            System.out.println("Рост равен либо превышает 1.8м.");
        }

        char firstLetterName = 'M';
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается с буквы M.");
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается с буквы I.");
        } else {
            System.out.println("Имя не начинается с букв M и I.");
        }
    }
}