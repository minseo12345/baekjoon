    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = 0;

            while(true){
                n = sc.nextInt();
                int sum = 0;
                ArrayList<Integer> list = new ArrayList<>();

                if(n == -1) break;

                for(int i = 1; i<n; i++){
                    if( n % i == 0){
                        sum += i;
                        list.add(i);
                    }
                }

                Collections.sort(list);

                if (sum == n) {
                    System.out.print(n + " = " + list.get(0));
                    for (int i = 1; i < list.size(); i++) {
                        System.out.print(" + " + list.get(i));
                    }
                    System.out.println();
                } else {
                    System.out.println(n + " is NOT perfect.");
                }
            }

        }
    }
