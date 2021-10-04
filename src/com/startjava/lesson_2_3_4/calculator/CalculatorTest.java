package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        String answer = "yes";
        while (answer.equals("yes")) {

            System.out.print("Введите математическое выражение (например, 2 ^ 10): ");
            Scanner scanner = new Scanner(System.in);
            String[] mathArray = scanner.nextLine().split(" ");

            int firstNum = Integer.parseInt(mathArray[0]);
            String sign = mathArray[1];
            int secondNum = Integer.parseInt(mathArray[2]);

            Calculator calculator = new Calculator(firstNum, sign, secondNum);
            System.out.println("Результат расчета: " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}