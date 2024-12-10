import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer>[] arr;
    static boolean[] visited;
    static int res = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 0; i<n+1; i++){
            arr[i] = new ArrayList<>();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int l = sc.nextInt();

        for(int i = 0; i<l; i++){
            int p = sc.nextInt();
            int c = sc.nextInt();
            arr[p].add(c);
            arr[c].add(p);
        }

        dfs(x,y,0);
        System.out.println(res);
    }
    private static void dfs(int start, int end, int cnt){
        if(start == end){
            res = cnt;
            return;
        }

        visited[start] = true;
        for(int i = 0; i<arr[start].size(); i++){
            int next = arr[start].get(i);
            if(!visited[next]){
                dfs(next,end,cnt+1);
            }
        }
    }


}
