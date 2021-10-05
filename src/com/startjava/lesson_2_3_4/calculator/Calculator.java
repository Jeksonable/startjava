package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNum;
    private String sign;
    private int secondNum;

    public Calculator(String formula) {
        String[] mathArray = formula.split(" ");
        firstNum = Integer.parseInt(mathArray[0]);
        sign = mathArray[1];
        secondNum = Integer.parseInt(mathArray[2]);
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