import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notes = new int[8];
        
        for (int i = 0; i < 8; i++) {
            notes[i] = scanner.nextInt();
        }
        
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 8; i++) {
            if (notes[i] != i + 1) {
                isAscending = false;
            }
            if (notes[i] != 8 - i) {
                isDescending = false;
            }
        }
        
        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        scanner.close();
    }
}
