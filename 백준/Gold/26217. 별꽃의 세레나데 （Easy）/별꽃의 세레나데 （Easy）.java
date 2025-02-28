import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double expected = 0.0;
        
        for (int i = 1; i <= N; i++) {
            expected += 1.0 / i;
        }
        
        expected *= N;
        System.out.printf("%.10f\n", expected);
        
        sc.close();
    }
}
