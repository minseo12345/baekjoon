import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> a = new PriorityQueue<>((x, y) -> {
            int absX = Math.abs(x);
            int absY = Math.abs(y);
            if (absX == absY) {
                return Integer.compare(x, y);  // 절댓값이 같으면 실제 값 비교
            } else {
                return Integer.compare(absX, absY);  // 절댓값 기준 비교
            }
        });
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =0; i<n; i++){
            int b = sc.nextInt();
            if(b!=0){
                a.add(b);
                count++;
            }else{
                if(a.isEmpty()){
                    System.out.println(0);
                }else{
                    int c = a.poll();
                    System.out.println(c);
                }

            }
        }

    }
}
