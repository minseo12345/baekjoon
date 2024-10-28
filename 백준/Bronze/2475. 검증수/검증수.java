import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int [] a =new int[5];

        for(int i =0 ;i<a.length;i++){
            int b = sc.nextInt();
            b = (int) Math.pow(b,2);
            a[i]=b;
        }

        int sum = 0;
        for(int c : a){
            sum+=c;
        }
        System.out.println(sum%10);
        
    }
}
