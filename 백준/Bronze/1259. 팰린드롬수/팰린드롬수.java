import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }

            int result = 0;
            int b = a;

            while (b != 0) {
                result = result * 10 + b % 10;
                b = b / 10;
            }
            
            if (a == result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
