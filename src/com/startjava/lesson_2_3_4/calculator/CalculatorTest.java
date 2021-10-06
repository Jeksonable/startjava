package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String answer = "yes";
        while (!answer.equals("no")) {
            Scanner scanner = new Scanner(System.in);
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение (например, 2 ^ 10): ");
                Calculator calculator = new Calculator(scanner.nextLine());
                System.out.println("Результат расчета: " + calculator.calculate());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
        }
    }
}