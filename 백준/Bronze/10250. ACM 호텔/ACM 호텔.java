import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            int floor = N % H == 0 ? H : N % H;
            int roomNumber = (N - 1) / H + 1;

            System.out.printf("%d%02d\n", floor, roomNumber);
        }
    }
}
