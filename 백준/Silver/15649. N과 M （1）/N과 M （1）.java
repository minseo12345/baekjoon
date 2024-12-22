import java.util.Scanner;

public class Main {

    static int N, M;
    static int[] sequence;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sequence = new int[M];
        visited = new boolean[N + 1];

        generatePermutation(0);
    }

    public static void generatePermutation(int index) {
        if (index == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[index] = i;
                generatePermutation(index + 1);
                visited[i] = false;
            }
        }
    }
}
