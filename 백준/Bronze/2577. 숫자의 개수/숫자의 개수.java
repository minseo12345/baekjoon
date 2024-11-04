import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String d = String.valueOf(a*b*c);
        char f = '0';
        for(int i =0; i<=9; i++) {

            int count = 0;
            for(int j =0; j<d.length(); j++) {
                if(d.charAt(j)==f) {
                    count++;
                }
            }
            f++;
            System.out.println(count);
        }
    }
}
