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
        int result = 0;
        switch (sign) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "^":
                if (firstNum != 0) {
                    result = 1;
                    while (secondNum > 0) {
                        result *= firstNum;
                        secondNum--;
                    }
                }
                break;
            case "%":
                result = firstNum % secondNum;
                break;
            default:
                System.out.println("Неизвестная математическая операция.");
        }
        return result;
    }
}