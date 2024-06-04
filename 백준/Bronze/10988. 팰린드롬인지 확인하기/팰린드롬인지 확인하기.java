import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuffer b = new StringBuffer(a);
        String reverse = b.reverse().toString();

        if (a.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
