import java.util.Scanner;

public class Main {

    static int[] numbers;
    static int k;
    static int[] selected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            k = sc.nextInt();
            if (k == 0) break;

            numbers = new int[k];
            selected = new int[6];

            for (int i = 0; i < k; i++) {
                numbers[i] = sc.nextInt();
            }

            findCombinations(0, 0);

            System.out.println();
        }
    }


    private static void findCombinations(int start, int depth) {

        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < k; i++) {
            selected[depth] = numbers[i];
            findCombinations(i + 1, depth + 1);
        }
    }
}
