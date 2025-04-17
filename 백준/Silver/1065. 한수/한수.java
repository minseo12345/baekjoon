import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = 0 ;

        for(int i = 1; i <= N; i++) {
            if(isHansu(i)){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean isHansu(int n){
        if(n < 100){
            return true;
        }

        int hundred = n / 100;
        int ten = (n/10) % 10;
        int one = n % 10;

        return (hundred - ten) == (ten - one);
    }
}
