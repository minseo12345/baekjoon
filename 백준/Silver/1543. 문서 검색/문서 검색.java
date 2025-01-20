import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int count = 0;
        int start = 0;

        while (start <= a.length() - b.length()) {
            boolean found = true;

            for (int i = 0; i < b.length(); i++) {
                if (a.charAt(start + i) != b.charAt(i)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                count++;
                start += b.length();
            } else {
                start++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
