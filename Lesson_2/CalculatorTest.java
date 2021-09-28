import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число: ");
            int firstNum = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            String sign = scanner.next();

            System.out.print("Введите второе число: ");
            int secondNum = scanner.nextInt();

            Calculator calculator = new Calculator(firstNum, sign, secondNum);
            System.out.println("Результат расчета: " + calculator.calculate());

            String answer = "";
            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                }
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}