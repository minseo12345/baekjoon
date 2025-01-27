import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> set = new LinkedHashSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < m; i++) {
            String a = sc.nextLine();
            if(set.contains(a)){
                set.remove(a);
                set.add(a);
            }
            set.add(a);
        }

        Iterator<String> iterator = set.iterator();
        for (int i = 0; i < n && iterator.hasNext(); i++) {
            System.out.println(iterator.next());
        }
    }
}
