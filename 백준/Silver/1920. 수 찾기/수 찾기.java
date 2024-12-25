import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int [] NArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        NArr = new int[N];

        for(int i= 0; i<NArr.length; i++){
            NArr[i] = sc.nextInt();
        }

        Arrays.sort(NArr);

        M = sc.nextInt();
        
        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            System.out.println(binarySearch(target));
        }

    }
    static int binarySearch(int target){

        int st = 0;
        int en = NArr.length-1;

        while(st<=en){
            int mid = (st+en)/2;

            if(NArr[mid] < target){
                st = mid + 1;
            }
            else if(NArr[mid] > target){
                en = mid-1;
            }else return 1;

        }
        return 0;
    }
}
