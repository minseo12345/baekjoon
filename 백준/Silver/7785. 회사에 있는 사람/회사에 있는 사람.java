import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            String a = sc.next();
            String b = sc.next();

            if (b.equals("enter")) {
                set.add(a);
            } else {
                set.remove(a);
            }
        }

        for (String name : set) {
            System.out.println(name);
        }
    }
}
