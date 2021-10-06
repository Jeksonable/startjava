package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name, int attempts) {
        this.name = name;
        numbers = new int[attempts];
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
    }

    public int[] getNumbers(int attempt) {
        return Arrays.copyOfRange(numbers, 0, attempt);
    }

    public void clearNumbers(int attempt) {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}