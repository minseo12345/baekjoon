    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            for (int i = 2; i<=N; i++){
                while (N % i == 0){
                    if(N == 1){
                        break;
                    }else {
                        System.out.println(i);
                        N = N/i;
                    }
                }
            }
        }
    }
