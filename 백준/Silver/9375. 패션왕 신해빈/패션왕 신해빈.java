import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        while (testCase> 0) {
            int n = sc.nextInt();
            Map<String, Integer> clothes = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String name = sc.next();
                String type = sc.next();
                clothes.put(type, clothes.getOrDefault(type, 0) + 1);
            }

            int combinations = 1;
            for (int count : clothes.values()) {
                combinations *= (count + 1);
            }

            System.out.println(combinations - 1);
            testCase--;
        }

        sc.close();
    }
}
