import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);  // 한 글자를 입력받음
        System.out.println((int) input);   // ASCII 코드 값 출력
    }
}
