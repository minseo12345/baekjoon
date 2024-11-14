import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            remainders.add(num % 42);
        }
        
        System.out.println(remainders.size());

        scanner.close();
    }
}
