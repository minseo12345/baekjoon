
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n %2 ==0 ){
            for(int i =1; i<=n; i++){
                if(i %2 !=0){
                    System.out.print(1+ " ");
                }else{
                    System.out.print(2 + " ");
                }
            }
        }else{
            for(int i =1; i<=n; i++){
                if (i == n) {
                    System.out.print(3 + " ");
                    break;
                }
                if(i %2 !=0){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(2 + " ");
                }
            }
        }
    }
}
