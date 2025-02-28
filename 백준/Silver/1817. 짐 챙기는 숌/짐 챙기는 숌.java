import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N == 0) { 
            System.out.println(0);
            return;
        }

        int[] books = new int[N];
        for (int i = 0; i < N; i++) {
            books[i] = sc.nextInt();
        }

        int boxCount = 1; 
        int currentWeight = 0;

        for (int weight : books) {
            if (currentWeight + weight > M) { 
                boxCount++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }

        System.out.println(boxCount);
    }
}
