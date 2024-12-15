import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E=1, S=1, M = 1;

        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        while(true){
            if(e == E && s == S && M == m){
                System.out.println(i);
                break;
            }

            E++;
            S++;
            M++;

            if(E==16) E=1;
            if(S==29) S=1;
            if(M==20) M=1;

            i++;
        }
    }

}
