import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // N을 입력받음
        
        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
        
        sc.close(); // Scanner 객체 닫기
    }
}
