package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNumber;
    private int attempt;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        hiddenNumber = new Random().nextInt(END_RANGE) + START_RANGE;
        attempt = 0;
        while (attempt < GuessNumberTest.ATTEMPTS) {
            attempt++;
            if (makeMove(firstPlayer)) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + hiddenNumber + " с " + attempt + " попытки!");
                break;
            }
            checkAttempt(firstPlayer);
            if (makeMove(secondPlayer)) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + hiddenNumber + " с " + attempt + " попытки!");
                break;
            }
            checkAttempt(secondPlayer);
        }
        printPlayerNumbers(firstPlayer);
        printPlayerNumbers(secondPlayer);
        firstPlayer.clearNumbers(attempt);
        secondPlayer.clearNumbers(attempt);
    }

    private boolean makeMove(Player player) {
        System.out.print("Очередь игрока " + player.getName() + ". Введите число от 1 до 100: ");
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt(), attempt - 1);
        if (player.getNumber(attempt - 1) == hiddenNumber) {
            System.out.println("Поздравляю, число угадано! Игрок " + player.getName() + " одержал победу!");
            return true;
        } else {
            String inequalitySign = player.getNumber(attempt - 1) < hiddenNumber ? "меньше" : "больше";
            System.out.println("Данное число " + inequalitySign + " того, что загадал компьютер.");
            return false;
        }
    }

    private void checkAttempt(Player player) {
        if (attempt == GuessNumberTest.ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    private void printPlayerNumbers(Player player) {
        if (player.getNumber(0) == 0) {
            System.out.println("Игрок " + player.getName() + " не успел назвать число :(");
        } else {
            int[] enteredNumbers = player.getNumbers(attempt);
            System.out.print("Игрок " + player.getName() + " назвал числа:");
            for (int number: enteredNumbers) {
                if (number != 0) {
                    System.out.print(" " + number);
                }
            }
            System.out.println();
        }
    }
}