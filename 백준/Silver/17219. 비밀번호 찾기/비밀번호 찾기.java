import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            String a = sc.next();
            String b = sc.next();
            sc.nextLine();
            map.put(a, b);
        }

        for(int i = 0; i < M; i++) {
            String a = sc.nextLine();

            System.out.println(map.get(a));
        }


    }
}
