import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "";
        while (!answer.equals("no")) {
            System.out.print("Введите первое число: ");
            int firstNum = scanner.nextInt();

            System.out.print("Введите знак математической операции: ");
            String sign = scanner.next();

            System.out.print("Введите второе число: ");
            int secondNum = scanner.nextInt();

            Calculator calculator = new Calculator(firstNum, sign, secondNum);
            System.out.println("Результат расчета: " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while(!(answer.equals("yes") ^ answer.equals("no")));
        }
    }
}