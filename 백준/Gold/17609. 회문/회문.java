import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str, int st, int en) {
        while (st < en) {
            if (str.charAt(st) != str.charAt(en)) {
                return false;
            }
            st++;
            en--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] a = new String[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            String str = a[i];
            int st = 0;
            int en = str.length() - 1;
            boolean isSimilarPalindrome = false;


            while (st < en) {
                if (str.charAt(st) == str.charAt(en)) {
                    st++;
                    en--;
                } else {

                    if (isPalindrome(str, st + 1, en) || isPalindrome(str, st, en - 1)) {
                        isSimilarPalindrome = true;
                    }
                    break;
                }
            }

            if (st >= en) {
                System.out.println(0);
            } else if (isSimilarPalindrome) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
