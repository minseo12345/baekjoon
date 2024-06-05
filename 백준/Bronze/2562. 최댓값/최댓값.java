import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[9];

        int index =0;
        for(int i = 0; i<9; i++){
            int b = sc.nextInt();
            a[i] =b;
        }
        int max = a[0];

        for(int i = 1; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);

        for(int i = 0; i <9; i++){
            if(a[i] == max){
                index = i;

            }else if(max == a[0]){
                index=0;
            }
        }

        System.out.println(index+1);

    }
}
