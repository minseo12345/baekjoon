import java.util.*;

public class Main {
    static int [] arr1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        arr1 = new int[m];

        for(int i = 0; i < m; i++){
           arr1[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        int l = 0;
        int r = arr.length - 1;
        for(int i = 0; i < m; i++){
            System.out.print(binarySearch(arr, 0, r, arr1[i]) + " ");
        }

    }
    static int binarySearch(int [] arr,int l, int r ,int key){
        while(l <= r){
            int mid = (l+r)/2;

            if(arr[mid] == key){
                return 1;
            }else if(arr[mid] < key){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return 0;
    }
}
