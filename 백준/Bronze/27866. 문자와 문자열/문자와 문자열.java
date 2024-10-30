import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       int a = sc.nextInt();
        System.out.println(name.charAt(a-1));
    }
}
