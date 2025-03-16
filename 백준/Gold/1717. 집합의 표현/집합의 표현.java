import java.util.*;

public class Main {
    static int N, M;
    static int [] arr;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N+1];

        for(int i = 1; i <= N; i++) arr[i] = i;

        for(int i =0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0){
                union(b,c);
            }else if(a == 1){
                System.out.println(findAnswer(b, c) ? "YES" : "NO");
            }
        }

    }

    static boolean findAnswer(int x, int y){
        return find(x) == find(y);
    }

    static int find(int x){
        if(x == arr[x]) return x;
        else return arr[x] = find(arr[x]);
    }

    static void union(int x, int y){
        int a = find(x);
        int b = find(y);
        if(a != b) arr[b] = a;

    }
}
