package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name, int attempts) {
        this.name = name;
        this.numbers = new int[attempts];
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void setNumber(int number, int index) {
        this.numbers[index] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}