package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_HIDDEN_NUMBER = 1;
    public static final int MAX_HIDDEN_NUMBER = 100;
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNumber;
    private int attempt;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        hiddenNumber = new Random().nextInt(MAX_HIDDEN_NUMBER) + MIN_HIDDEN_NUMBER;
        attempt = 0;
        while (attempt < GuessNumberTest.ATTEMPTS) {
            if (makeMove(firstPlayer)) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + hiddenNumber + " с " + (attempt + 1) + " попытки!");
                break;
            }
            checkAttempt(firstPlayer);
            if (makeMove(secondPlayer)) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + hiddenNumber + " с " + (attempt + 1) + " попытки!");
                break;
            }
            checkAttempt(secondPlayer);
            attempt++;
        }
        printPlayerNumbers(firstPlayer);
        printPlayerNumbers(secondPlayer);
        clearPlayerNumbers(firstPlayer, attempt);
        clearPlayerNumbers(secondPlayer, attempt);
    }

    private boolean makeMove(Player player) {
        System.out.print("Очередь игрока " + player.getName() + ". Введите число от 1 до 100: ");
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt(), attempt);
        if (player.getNumber(attempt) == hiddenNumber) {
            System.out.println("Поздравляю, число угадано! Игрок " + player.getName() + " одержал победу!");
            return true;
        } else {
            String inequalitySign = player.getNumber(attempt) < hiddenNumber ? "меньше" : "больше";
            System.out.println("Данное число " + inequalitySign + " того, что загадал компьютер.");
            return false;
        }
    }

    private void checkAttempt(Player player) {
        if (attempt == GuessNumberTest.ATTEMPTS - 1) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    private void printPlayerNumbers(Player player) {
        if (player.getNumber(0) == 0) {
            System.out.println("Игрок " + player.getName() + " не успел назвать число :(");
        } else {
            int[] enteredNumbers = Arrays.copyOf(player.getNumbers(), attempt + 1);
            System.out.print("Игрок " + player.getName() + " назвал числа:");
            for (int number: enteredNumbers) {
                if (number != 0) {
                    System.out.print(" " + number);
                }
            }
            System.out.println(".");
        }
    }

    private void clearPlayerNumbers(Player player, int attempt) {
        int[] playerNumbers = player.getNumbers();
        Arrays.fill(playerNumbers, 0, attempt, 0);
        player.setNumbers(playerNumbers);
    }
}