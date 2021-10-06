package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static final int ATTEMPTS = 10;
    public static final int FIRST = 1;
    public static final int SECOND = 2;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Старт игры! У каждого игрока есть 10 попыток угадать загаданное компьютером число.");
        GuessNumber game = new GuessNumber(createPlayer(FIRST), createPlayer(SECOND));
        String answer = "yes";
        while (!answer.equals("no")) {
            if (answer.equals("yes")) {
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        }
    }

    private static Player createPlayer(int number) {
        System.out.print("Введите имя " + number + "-го игрока: ");
        return new Player(scanner.next(), ATTEMPTS);
    }
}