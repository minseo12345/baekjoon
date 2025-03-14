import java.util.Scanner;

public class Main {
    static int N;
    static int [] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N+1];

        for(int i = 0; i < N; i++) arr[i] = i;

        for(int i = 0; i<N-2; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            union(a,b);
        }

        int first = -1, second = -1;
        for (int i = 1; i <= N; i++) {
            if (find(i) != find(1)) {
                first = 1;
                second = i;
                break;
            }
        }

        System.out.println(first + " " + second);

    }

    public static int find(int x){
        if(arr[x] == x) return x;
        else{
            return arr[x] = find(arr[x]);
        }
    }

    public static void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a != b){
            arr[b] = a;
        }
    }

    public static boolean isSame(int a, int b){
        if(find(a) == find(b)) return true;
        else return false;
    }
}
