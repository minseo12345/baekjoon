import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int e = sc.nextInt();  
        int start = sc.nextInt();  

        int[][] arr = new int[n + 1][n + 1]; 
        
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u][v] = 1;  
            arr[v][u] = 1;  
        }

        // DFS 탐색
        boolean[] visited = new boolean[n + 1];
        dfs(arr, start, visited);
        System.out.println();

        // BFS 탐색
        visited = new boolean[n + 1];
        bfs(arr, start, visited);
    }
    
    public static void dfs(int[][] arr, int start, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);  

        while (!stack.isEmpty()) {
            int vertex = stack.pop();

            if (!visited[vertex]) {
                visited[vertex] = true; 
                System.out.print(vertex + " "); 
            }
            
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[vertex][i] == 1 && !visited[i]) {
                    stack.push(i); 
                }
            }
        }
    }
    
    public static void bfs(int[][] arr, int start, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            
            for (int i = 1; i < arr.length; i++) {
                if (arr[vertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
