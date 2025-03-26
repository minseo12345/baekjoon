import java.util.*;

public class Main {
    static int T, N, M, X, Y;
    static int [] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            M = sc.nextInt();

            X = 0;
            Y = 0;

            for(int i = 0; i<M; i++) X = X * 10 + sc.nextInt();
            for(int i = 0; i<M; i++) Y = Y * 10 + sc.nextInt();

            arr = new int[N];

            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();
            int count = 0;

            for(int i = 0; i<N; i++){
                int Z = 0;
                for (int j = 0; j < M; j++){
                    Z = Z * 10 + arr[(i+j)%N];
                }
                if (X <= Z && Z <= Y) count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
