import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        Set<String> unheard = new HashSet<>();
        List<String> unseenAndUnheard = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            unheard.add(sc.nextLine());
        }

        for (int i = 0; i < M; i++) {
            String name = sc.nextLine();
            if (unheard.contains(name)) {
                unseenAndUnheard.add(name);
            }
        }

        Collections.sort(unseenAndUnheard);

        System.out.println(unseenAndUnheard.size());
        for (String name : unseenAndUnheard) {
            System.out.println(name);
        }
    }
}
