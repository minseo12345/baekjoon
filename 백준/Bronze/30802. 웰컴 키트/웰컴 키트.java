import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long N = scanner.nextLong(); 
        long[] sizes = new long[6]; 
        for (int i = 0; i < 6; i++) {
            sizes[i] = scanner.nextLong();
        }
        long T = scanner.nextLong(); 
        long P = scanner.nextLong(); 
        
        long tshirtBundles = 0;
        for (long size : sizes) {
            tshirtBundles += (size + T - 1) / T;
        }
        
        long penBundles = N / P; 
        long extraPens = N % P;  
        
        System.out.println(tshirtBundles);
        System.out.println(penBundles + " " + extraPens);

        scanner.close();
    }
}
