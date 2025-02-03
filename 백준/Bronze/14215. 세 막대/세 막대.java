import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sticks = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        sc.close();
        
        Arrays.sort(sticks);
        int a = sticks[0], b = sticks[1], c = sticks[2];
        
        if (a + b > c) {
            System.out.println(a + b + c);
        } else {
            System.out.println((a + b) * 2 - 1);
        }
    }
}
