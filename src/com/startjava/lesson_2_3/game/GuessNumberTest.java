package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player firstPlayer = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player secondPlayer = new Player(scanner.next());

        String answer = "";
        while (!answer.equals("no")) {
            GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);
            game.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}