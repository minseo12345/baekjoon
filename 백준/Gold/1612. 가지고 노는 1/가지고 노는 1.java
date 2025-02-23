import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int t = 1 % n;
        int length = 1;
        Set<Integer> visited = new HashSet<>(); 

        while (t != 0) {
            if (visited.contains(t)) { 
                System.out.println(-1);
                return;
            }

            visited.add(t);  
            t = (t * 10 + 1) % n;
            length++;

            if (length > n) {  
                System.out.println(-1);
                return;
            }
        }

        System.out.println(length);
    }
}
