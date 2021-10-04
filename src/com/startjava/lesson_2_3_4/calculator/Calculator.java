package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNum;
    private String sign;
    private int secondNum;

    public Calculator(int firstNum, String sign, int secondNum) {
        this.firstNum = firstNum;
        this.sign = sign;
        this.secondNum = secondNum;
    }

    public int calculate() {
        switch (sign) {
            case "+":
                return Math.addExact(firstNum, secondNum);
            case "-":
                return Math.subtractExact(firstNum, secondNum);
            case "*":
                return Math.multiplyExact(firstNum, secondNum);
            case "/":
                return Math.floorDiv(firstNum, secondNum);
            case "^":
                return (int) Math.pow(firstNum, secondNum);
            case "%":
                return firstNum % secondNum;
            default:
                System.out.println("Неизвестная математическая операция.");
                return 0;
        }
    }
}