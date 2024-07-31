import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;

        String b = sc.next();

        char [] a = b.toCharArray();

        for(int i =0; i<a.length; i++){
            sum += a[i] - '0';
        }
        System.out.println(sum);
    }
}
