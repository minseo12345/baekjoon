import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String input = sc.next();

        int r = 31;
        int m = 1234567891;

        long hash = 0;
        long current = 1;

        for(int i = 0; i < n; i++) {
            int a = input.charAt(i) - 'a' + 1;
            hash = (hash + a * current) % m;
            current = (current * r) % m;
        }

        System.out.println(hash);
    }
}
