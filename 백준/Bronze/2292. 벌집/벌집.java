import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 1;
        int range = 2;

        if(N == 1){
            System.out.println(1);
            return;
        }

        while (range <= N){
            range = range + (count * 6);
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
