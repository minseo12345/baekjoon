import java.util.*;

public class Main {
    static int G;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        G = sc.nextInt();

        long start = 1;
        long end = 2;
        boolean flag = false;

        while (end < 100000) {
            long startWeight = start * start;
            long endWeight = end * end;

            if (endWeight - startWeight == G) {
                System.out.println(end);
                flag = true;
            }

            if (endWeight - startWeight >= G) {
                start += 1;
            } else {
                end += 1;
            }
        }

        if (!flag) System.out.println(-1);
    }
}
