import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String a = sc.nextLine().trim();

        String [] b = a.split("\\s+");

        int count = (a.isEmpty()) ? 0 : b.length;

        System.out.println(count);

    }
}
