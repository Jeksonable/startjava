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
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
            case "^":
                int result = 0;
                if (firstNum != 0) {
                    result = 1;
                    while (secondNum > 0) {
                        result *= firstNum;
                        secondNum--;
                    }
                }
                return result;
            case "%":
                return firstNum % secondNum;
            default:
                System.out.println("Неизвестная математическая операция.");
                return 0;
        }
    }
}