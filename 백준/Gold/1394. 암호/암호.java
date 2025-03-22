import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String code = sc.nextLine();
        int[] arr = new int[200];
        int result = 0;
        int size = s.length();

        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - '!';
            if (arr[index] == 0) {
                arr[index] = i + 1;
            }
        }

        for (int i = 0; i < code.length(); ++i) {
            int index = code.charAt(i) - '!';

            result *= size;
            result += arr[index];
            result %= 900528;
        }

        System.out.println(result);
        sc.close();
    }
}
