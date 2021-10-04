package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Старт игры! У каждого игрока есть 10 попыток угадать загаданное компьютером число.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.next(), 10);

        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.next(), 10);

        String answer = "yes";
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
        while (answer.equals("yes")) {
            game.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}