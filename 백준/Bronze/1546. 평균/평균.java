import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int[n];

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        long max = 0;
        long sum =0;

        for(int i = 0; i<n; i++){
            if(a[i] >max) max = a[i];
            sum = sum + a[i];

        }

        System.out.println(sum * 100.0/max/n);
    }
}
