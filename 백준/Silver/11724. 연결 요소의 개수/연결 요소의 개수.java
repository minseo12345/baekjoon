import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> [] a;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new ArrayList[n+1];
        visited = new boolean[n+1];
        int count =0;

        for(int i= 1; i<n+1; i++){
            a[i] = new ArrayList<Integer>();

        }

        for(int i =0;i < m; i++ ){
            st=new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            a[s].add(e);
            a[e].add(s);

        }

        for(int i =1 ; i<n+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;

        for(int i : a[v]){
            if(visited[i] == false);
            DFS(i);
        }
    }
}
