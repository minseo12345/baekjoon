import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [] a = new String[num];
        for(int i = 0; i < num; i++){
            a[i] = sc.next();
        }

        for(int i =0; i<a.length; i++){
            int sum =0;
            int count = 0;
            for(int j =0; j<a[i].length(); j++){
                if (a[i].charAt(j) == 'O') {
                    ++count;
                    sum += count;
                }else if (a[i].charAt(j) == 'X') {
                    count=0;
                }
            }
            System.out.println(sum);
        }

    }
}
