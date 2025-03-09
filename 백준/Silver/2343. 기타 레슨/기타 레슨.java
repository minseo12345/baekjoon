import java.util.*;

public class Main {
    static int N, M;
    static int [] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];

        int st =0, en = 0;

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            st = Math.max(st, arr[i]);
            en += arr[i];
        }

        while (st < en){
            int mid = (st + en) /2;

            if(check(mid)){
                en = mid;
            }else{
                st = mid + 1;
            }
        }

        System.out.println(st);
    }

    static boolean check(int size){
        int count =1, sum = 0;
        for(int lesson : arr){
            if(sum + lesson > size){
                count++;
                sum = lesson;
            } else{
                sum += lesson;
            }
        }
        return count <= M;
    }
}
