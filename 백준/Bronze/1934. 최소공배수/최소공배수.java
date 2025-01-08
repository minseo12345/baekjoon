import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0; i<T; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            int lcm = a*b / gcd(a,b);
            System.out.println(lcm);
        }

    }
    private static int gcd(int a, int b){
        while(b !=0){
            int temp = b;
            b= a % b;
            a = temp;
        }

        return a;
    }
}
