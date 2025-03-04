import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int [] arr;
    static boolean [] visited;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        visited = new boolean[N+1];

        dfs(0);

    }

    static void dfs(int idx){
        if(idx == M){
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[idx] = i;
                dfs(idx+1);
                visited[i] = false;
            }
        }
    }
}
