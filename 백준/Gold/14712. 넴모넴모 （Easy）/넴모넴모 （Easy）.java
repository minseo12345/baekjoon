import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int ans;
    static int[][] arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+1][M+1];
        ans = 0;

        dfs(0);
        System.out.println(ans);

    }

    static void dfs(int cnt){
        if(cnt == N*M){
            ans++;
            return;
        }

        int y = cnt / M + 1;
        int x = cnt % M + 1;

        if(arr[y-1][x] == 1 && arr[y][x-1] == 1 && arr[y-1][x-1] == 1){
            dfs(cnt+1);
        }else{
            dfs(cnt+1);
            arr[y][x] = 1;
            dfs(cnt+1);
            arr[y][x] = 0;
        }
    }
}
