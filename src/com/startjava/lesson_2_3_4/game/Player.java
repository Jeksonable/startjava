package com.startjava.lesson_2_3_4.game;

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

    public void setNumber(int number, int index) {
        this.numbers[index] = number;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers() {
        return numbers;
    }
}