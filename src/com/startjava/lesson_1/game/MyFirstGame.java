package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int computerNum = 50;
        int playerNum = 45;
        System.out.println("Компьютер загадал целое число от 0 до 100. Игрок начал угадывать с " + playerNum);

        while (playerNum != computerNum) {
            if (playerNum < computerNum) {
                System.out.println("Данное число меньше того, что загадал компьютер.");
                playerNum++;
                System.out.println("Увеличим число на 1. Может быть это число " + playerNum);
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNum--;
                System.out.println("Уменьшим число на 1. Может быть это число " + playerNum);
            }
        }
        System.out.println("Поздравляю, число угадано!");
    }
}