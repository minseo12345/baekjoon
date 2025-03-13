import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];
        int [] res = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int count = arr[i];
            for(int j = 0; j < N; j++){
                if (count == 0 && res[j] == 0){
                    res[j] = i +1;
                    break;
                }else if(res[j] == 0){
                    count--;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
