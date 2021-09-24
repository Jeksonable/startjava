public class Calculator {
    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 3;
        char sign = '^';

        int result = 0;
        if (sign == '+') {
            result = firstNum + secondNum;
        } else if (sign == '-') {
            result = firstNum - secondNum;
        } else if (sign == '*') {
            result = firstNum * secondNum;
        } else if (sign == '/') {
            result = firstNum / secondNum;
        } else if (sign == '^') {
            if (firstNum != 0) {
                result = 1;
                while (secondNum > 0) {
                    result *= firstNum;
                    secondNum -= 1;
                }
            }
        } else if (sign == '%') {
            result = firstNum % secondNum;
        }
        System.out.println(result);
    }
}