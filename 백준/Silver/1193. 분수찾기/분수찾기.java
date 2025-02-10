import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int crossCount = 1;
        int sum = 0;

        while (true){

            if(n <= crossCount + sum){

                if(crossCount % 2 == 1){
                    System.out.println((crossCount - (n- sum -1)) + "/" + (n - sum));
                    break;
                }else{
                    System.out.println((n - sum) + "/" + (crossCount - (n- sum -1)));
                    break;
                }
            }else{
                sum += crossCount;
                crossCount++;
            }
        }

    }
}
