import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        int[] switches = new int[N]; 
        
        for (int i = 0; i < N; i++) {
            switches[i] = sc.nextInt();
        }
        
        int M = sc.nextInt();  
        
        for (int i = 0; i < M; i++) {
            int gender = sc.nextInt();
            int num = sc.nextInt();
            
            if (gender == 1) { 
                for (int j = num - 1; j < N; j += num) {
                    switches[j] = 1 - switches[j];
                }
            } else {
                int idx = num - 1;
                switches[idx] = 1 - switches[idx];
                int left = idx - 1, right = idx + 1;
                
                while (left >= 0 && right < N && switches[left] == switches[right]) {
                    switches[left] = 1 - switches[left];
                    switches[right] = 1 - switches[right];
                    left--;
                    right++;
                }
            }
        }
   
        for (int i = 0; i < N; i++) {
            System.out.print(switches[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println();
        }
    }
}
