import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNum;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void setRandomHiddenNum() {
        Random random = new Random();
        hiddenNum = random.nextInt(100) + 1;
    }

    public boolean playerTurn(Player player) {
        Scanner scanner = new Scanner(System.in);
        int playerNum = 0;
        System.out.print("Очередь игрока " + player.getName() + ". Введите число от 1 до 100: ");
        playerNum = scanner.nextInt();
        if (playerNum < hiddenNum) {
            System.out.println("Данное число меньше того, что загадал компьютер.");
            return false;
        } else if (playerNum > hiddenNum) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Поздравляю, число угадано! Игрок " + player.getName() + " одержал победу!");
            return true;
        }
    }

    public void play() {
        setRandomHiddenNum();
        while (true) {
            if (playerTurn(firstPlayer)) {
                break;
            }
            if (playerTurn(secondPlayer)) {
                break;
            }
        }
    }
}