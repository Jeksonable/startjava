package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static final int ATTEMPTS = 10;
    public static final int FIRST = 1;
    public static final int SECOND = 2;

    public static void main(String[] args) {
        System.out.println("Старт игры! У каждого игрока есть 10 попыток угадать загаданное компьютером число.");
        GuessNumber game = new GuessNumber(initPlayer(FIRST), initPlayer(SECOND));
        String answer = "yes";
        while (true) {
            if (answer.equals("yes")) {
                game.play();
            } else if (answer.equals("no")) {
                break;
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.next();
        }
    }

    private static Player initPlayer(int number) {
        System.out.print("Введите имя " + number + "-го игрока: ");
        Scanner scanner = new Scanner(System.in);
        return new Player(scanner.next(), ATTEMPTS);
    }
}