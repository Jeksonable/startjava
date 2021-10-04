package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNum;
    private int attempt;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        hiddenNum = new Random().nextInt(100) + 1;
    }

    public void play() {
        attempt = 0;
        while (attempt < 10) {
            if (makeMove(firstPlayer)) {
                System.out.println("Игрок " + firstPlayer.getName() + " угадал число " + hiddenNum + " с " + (attempt + 1) + " попытки!");
                break;
            }
            checkAttempt(firstPlayer);
            if (makeMove(secondPlayer)) {
                System.out.println("Игрок " + secondPlayer.getName() + " угадал число " + hiddenNum + " с " + (attempt + 1) + " попытки!");
                break;
            }
            checkAttempt(secondPlayer);
            attempt++;
        }
        printArrayPlayer(firstPlayer);
        printArrayPlayer(secondPlayer);
        Arrays.fill(firstPlayer.getNumbers(), 0, attempt + 1, 0);
        Arrays.fill(secondPlayer.getNumbers(), 0, attempt + 1, 0);
    }

    private boolean makeMove(Player player) {
        System.out.print("Очередь игрока " + player.getName() + ". Введите число от 1 до 100: ");
        Scanner scanner = new Scanner(System.in);
        player.setNumber(scanner.nextInt(), attempt);
        if (player.getNumber(attempt) == hiddenNum) {
            System.out.println("Поздравляю, число угадано! Игрок " + player.getName() + " одержал победу!");
            return true;
        } else {
            if (player.getNumber(attempt) < hiddenNum) {
                System.out.println("Данное число меньше того, что загадал компьютер.");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
            return false;
        }
    }

    private void checkAttempt(Player player) {
        if (attempt == 9) {
            System.out.println("У " + player.getName() + " закончились попытки!");
        }
    }

    private void printArrayPlayer(Player player) {
        if (player.getNumber(0) == 0) {
            System.out.println("Игрок " + player.getName() + " не успел назвать число :(");
        } else {
            int[] array = Arrays.copyOf(player.getNumbers(), attempt + 1);
            System.out.print("Игрок " + player.getName() + " назвал числа:");
            for (int num: array) {
                if (num != 0) {
                    System.out.print(" " + num);
                }
            }
            System.out.println(".");
        }
    }
}