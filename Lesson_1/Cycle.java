public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            System.out.println(i);
        }

        int j = 6;
        while (j > -7) {
            System.out.println(j);
            j -= 2;
        }

        int sum = 0;
        int k = 10;
        do {
            if (k % 2 != 0) {
                sum += k;
            }
            k++;
        } while (k < 21);
        System.out.println(sum);
    }
}