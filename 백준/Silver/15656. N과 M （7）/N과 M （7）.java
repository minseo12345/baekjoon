import java.util.*;

public class Main {
    static int N, M;
    static int[] numbers, arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[N];
        arr = new int[M];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        dfs(0);

        System.out.print(sb);
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = numbers[i];
            dfs(depth + 1);
        }
    }
}
