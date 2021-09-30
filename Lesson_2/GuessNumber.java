import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int hiddenNum;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        hiddenNum = new Random().nextInt(100) + 1;
    }

    public void play() {
        while (true) {
            if (makeMove(firstPlayer)) {
                break;
            }
            if (makeMove(secondPlayer)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Очередь игрока " + player.getName() + ". Введите число от 1 до 100: ");
        int playerNum = scanner.nextInt();
        if (playerNum == hiddenNum) {
            System.out.println("Поздравляю, число угадано! Игрок " + player.getName() + " одержал победу!");
            return true;
        } else {
            if (playerNum < hiddenNum) {
                System.out.println("Данное число меньше того, что загадал компьютер.");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер");
            }
            return false;
        }
    }
}