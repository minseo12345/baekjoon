import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        int m = sc.nextInt();

        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int j = a; j<=b; j++){
                arr[j] = c;
            }
        }
        for(int i =1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
