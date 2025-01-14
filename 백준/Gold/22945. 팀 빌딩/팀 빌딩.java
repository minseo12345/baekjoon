import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = n-1;
        int result = 0;

        while(s<=e){

            int min = Math.min(arr[s], arr[e]);
            result = Math.max(min*(e-s-1),result);
            if(arr[s]<arr[e]){
                s++;
            }
            else{
                e--;
            }

        }
        System.out.println(result);
    }
}