import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        for(int i = 1; i <= v; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        int start = 1;

        boolean [] visited = new boolean[n+1];

        System.out.println(dfs(arr,start,visited));
    }
    private static int dfs(int[][] arr, int start,boolean[] visited){
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        int count = 0;

        while(!stack.isEmpty()){
            int cur = stack.pop();

            if(!visited[cur]){
                visited[cur] = true;
                count++;
            }

            for(int i = arr.length-1; i>0; i--){
                if(arr[cur][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }
        }
        return count;
    }
}
